## Macros

# Printer Macro
.macro print($string)
    la $a0, $string
    li $v0, 4
    syscall
.end_macro

# Clear Macro
.macro clearterminal
    li $t0, 20
loop:
    li $v0, 4
    la $a0, newline
    syscall
    addi $t0, $t0, -1
    bnez $t0, loop
.end_macro

# Selection Macro
.macro selection($question, $option1, $option2, $destination1, $destination2)
    print($question)
    print($option1)
    print($option2)

    # read integer from user
    li $v0, 5
    syscall
    move $t0, $v0

    # check if user entered 1
    li $t1, 1
    beq $t0, $t1, $destination1

    # check if user entered 2
    li $t1, 2
    beq $t0, $t1, $destination2

    # handle invalid input
    j invalid_input
.end_macro

.data
    prompt1: .asciiz "									.88b  d88. d88888b d88888b       .d88b.  db    db d88888b .d8888. d888888b \n									88'YbdP`88 88'     88'          .8P  Y8. 88    88 88'     88'  YP `~~88~~' \n									88  88  88 88ooooo 88ooo        88    88 88    88 88ooooo `8bo.      88    \n									88  88  88 88~~~~~ 88~~~        88    88 88    88 88~~~~~   `Y8b.    88    \n									88  88  88 88.     88           `8P  d8' 88b  d88 88.     db   8D    88    \n									YP  YP  YP Y88888P YP            `Y88'Y8 ~Y8888P' Y88888P `8888Y'    YP    \n\n					MMMMMMMMMMWN0O0OKOkKOkXKxONKOkOWWOO0kNWWXx0Xd0MMMMMKd0MWkdNMMWWMKx0KOKNXXXNX00XXXXdlKNNNdxWWWNXWMWdoKXOo0MNXNNxdN0dKWWW0xXOkWMWWWWMMMMMMMMMM\n					MMMMMMMMMWX0OOOOKOOKkON0xONKOk0WWOOOkNWMKd0Xd0MMMMM0d0MWxxNMMWWMKx0K0XXXXXNX0KNXXXdlKXXXdxWMWNXWMWxdNWOoONNXWWkdX0d0WWWKxKOxWMWMWWMMMMMMMMMM\n					MMMMMMMMWXOOOOOO0kOKkON0x0WKOO0MWO00kNWWKd0XdOMWWMM0o0NXddWMMWWWKx0K0KXKXXXX0KNNNNdl0KXNddWMMNXWMMxdNM0o0WNXNWkdXKd0WNWKx0OxNWWMWWMMMMMMMMMM\n					MMMMMMMWXOkOOOOO0xOKxON0k0WKOO0MWO0OkNWWKd0XdOMWWMMOlOWNdxWMWNXNOdO0kO00KKKK0KNNNNdl0KKKodNWMNXWMMkdNM0oOMWWWWOdXKdOWNWKd00xXWWMWWMMMMMMMMMM\n					MMMMMMWXOkkOO0OOKk0Kx0N0kKWKkk0MWkOOkNMMKxKKdOMWWMMOl0MNdxNNNXXW0xXX0KXXKKKKOOXNNNdoXWWWdoNMMWNWMMkdXMKoOMMWWMOdXXdOWNNXxO0xKWWMWWMMMMMMMMMM\n					MMMMMWKkkkkOOOOOKOKKx0N0kKW0kk0MN0KkkWMMKxKKdOWNNWWkl0WXooXWMNNW0xXXKNMMWMWNKKXXXXdlKWWWxoNWWNXNWMkoKN0oOMMNWMOdXNxOMWWXxO0dKWWWWWMMMMMMMMMM\n					MMMMWKkkkkkOOOOOKOKKkKNOkKM0kkKMWWXodNWW0o00okX00XNxc0WXodWMWXKXkdK00XNXNWWWXNMMMWxlKNXXolKXNNXNWWko0N0lkMWNNMOdKNxOMWWNxOKx0WNWWWMMMMMMMMMM\n					MMMWKOOkkkkOOOOO0kKKxKNOkKW0OOKMMM0loKNXOlO0lxOx0XNxlKMNloXNNKKXkxNX0XNXXXNX0KNNWWxoNWWWdoKXXX0KXNklKMXokWWXXW0o0NxkMWWWkkXx0WWWWWMMMMMMMMMM\n					WWNKOOOOOOOOO0O00xK0d0XOkKW0kkKMNKl;lOXXxlkOldKKXNNxl0XKloNWWNXXkxNXKNWWWWWNKKNNNNdl0XXXdoNWWNKXXNxcONKoxWWXXW0oOXdxWWWWkkXxOWWMWWMMMMMMMMMM\n					KK0OkOOOkkO0O0O00xOkd0KkkKWOkk0WKlccldxOx:oxclkO00KdcONXldNWWXKKxdXXKNWWWWMWXXMWWWxl0K00ll0KXK0XNWOlONKodXXKKN0oOWdxWNNWkxXxOWWWWWMMMMMMMMMM\n					0OxxkkkkkOO0OOkO0dxdokkxx0XkxxOXOloolxddocoxccoxkO0d:xOOcckkkdoocdNX0NMWWWWWKXMWWNdlKNXXdl000OkO0KxckXKodNNXKN0oONddNNNWkdKxOMWWWWMMMMMWWWNN\n					0kdxxxxkkOO000kkkddoodxddkOdookXkcoooOxdo:dx:;oxO00o;ldd:;llc:;;,oNX0XWWWWWNKXWWWWdlKNNXdl0XKKO0KXkcx0OloKXKKN0oOWxoXNNWkxXkkWWMWNK0K00OOOOO\n					OxxxdxxxxxkkOOkxxoddlxxddk0doookxllldOddol00:,cddooc,:ll:;c:;,;,'oNX0XWWNNWNKXWNNNdlKWWWxlKNNX0KNNOlOWNddXNKKN0lxNxdXWNWOdXkxNWWWXOO0KKKXK0O\n					kxxxxdddddddxOxdoodolddodxxoddoll:ccoxoxockk:,colcl:,;;c:,,,'';'.oXKOKXXNNNN0KWNNNdc0XXNxlKNNNKXNW0lkWWxdNWNXWXoxNxoXNXNOdKkxNWWWXdcc::;,,''\n					kdoddoooooooddooolollddlllcclc:;;:lc::;cc:lo;,clc:c:,,,;::,...,'.lXKk0XKKXKK0KNNNNdcOXKXdl0XKX0KXNOckWNdoXWXXWXokMkoXWNWOo0kdNWNWKc.''',,,;:\n					Okxkdlllllllllodollcldoc:;;;:;,';:lc,''',,';,.'','';'..,cc,...;..lK0k0XXXXKKOOKKKXd:xOkklcOKKKOO0KkcxXXdlKNXXWNdxWOoKWNWKd0OxXWWWXl,:;,;;;;:\n					OOO0Oolllllllclollollolcccc::;'';:c:,'',,,',,...'..,;..'c:....;..ckOkOKK0K00Ok0OO0o:k0OOocOXXX00KXOcdK0olKWNXWNdxWOoKWNWKd0OdXWWMNxcloodddxx\n					OkOOxlllccc:::colllccllccc:;:;,;::c:,'',,..,;'..'..,;..'c:...':;'ckk |  \\/  | __| __| | | | |_ _ (_)_ _____ _ _ __(_) |_ _  _ WWWW0xxxxxddoo\n					0OkOdcc:;:::::clcllccllc::;;:;;;::c:::;:;,.,;;'.'..;:;;cclllllccldkk | |\\/| | _|| _|  | |_| | ' \\| \\ V / -_) '_(_-< |  _| || |WWWNd.........\n					0Okko;;;;::::;clcllccccc:::;;::c::l::cclc::cccc:cloolloooooollcccdkO |_|  |_|___|_|    \\___/|_||_|_|\\_/\\___|_| /__/_|\\__|\\_, |0WWWWx,;,;:...\n					OOOkc'',,;;;;;clcllc:c::::::::cllclllolodolooollccc:::;;;,''....'okkoodddooodxxdddxkxxxxxxxxxkOOkxk00OkOOkO00k0K00XKKKKKK|__/ x0WWWWx':;;l'.\n					kkOk:..'',,,,,:ccllcllllllollllloc:::;,,,,'........             .:looodddooodxxdddxkxxxxxxxxxkOOkxk00OkOOkO00k0K00XKKKKKXKXXKXXNNNKdlccl::;,\n					xdddl:ccccclllddxxl::;;,,'''.......                     .          ..'''.'............'''',,,;:::::ccc:cccclolodddxxxkOOOO0K0KKKXXNk;;;,;;;;\n					kxxd:'''''''',,,,,'..........................                       ,::::l,                       ..  ..'.    .. .........';;'';;;;'........\n					kooo.            ..',,::,''''................. .      .   .    .....:doodkc. ....  ...          ....  .:dc             . .'l:  .'....  .  ..\n					dllc.       ..  ....'''..................  ......     .....    .....ckkkk0l.  ...  .......   .......  'lOo.  ........,,,'.:ko'',;,....     .\n					lcc;....... ..  .,..'.......................'................ .....'lOkOOKo.  ... ........   ....';,..,o0d. ........:occ:,lOo..,:c,..      ;\n					c'............  ':.......  .. ..............,................ .,,,,,o0OO0Ko.  .:. .::;,;;'. ....',,,,';dKx. ........','..,cdl..,;cl:,.     ;\n					c:;,;::;::::;,..,;''.'''.............  . . .,.,'       ...... .... .o0000Kd.  .;. .:cc:cc,......''....:d0Ol::::;:;;;;;,..,c:'...',cc;......:\n					lcc:,:clodxkkkkxdool;;:;;;;;:::;,,''''.....',';,.....  .   ..  .   .o0000Ko.  .....',,,;:,. .....'''.,cdOXXKKKKKKKK00K0Okl;''',;..,lxdddolcx\n					lccccc::clodkxxkxkOOOkxdolc::::;;;;::::c:::c;';,.....  ..  ..  .   .o0000Ko.  .... .. ..... ...''.',,;:dOKKKXXXXXNNXNNNNXd:,;coc..;oXKOK0odX\n					ccccllllc::loc;lccxk000KK0OOOkxdocc:::;;;;:c;';,. ... ... ...      .o0000Ko.   ............'',,;'..',,:d0KxdkkOOkO0OOOOOOd:;,,::'',cdocll::o\n					cccllccllcclc;.,,.,okkOKKKXXXKKK0OOOkxolcc:c:,:;..''''......       .oK00KXd. ....',,,',,;;;;;;;;'.';;,;dOKkoooddddoooooolll::;',,;;:::::;;;:\n					ooooooloolc::,',..,lkxxOXXXKKKKK00KXXK0000Okxddddxxxxxdlc:;;;;;;;:ccxK00KKx,'',,;;;;;::::cccllc;;:,',;ldkOkl;:c:;:;,,,,,,,,,,:::::::::::::::\n					:oxkxddddoc:,':l:;,;lloOXKKK0KKKXKKKK000KKK0KK0OOkxddxxxxxxxxdddlodcdK000Kklccllllllloooolllll:,,;,..,:ldxkkkOkkxxxdddoolollllcccc::cl;,,,;:\n					.,coddddoc:;'';ll,.,ooxKXXXXXXXXXXXXXXKKKKKK00KKKKK00OOkkxxxxddddddlxKKKKXOxxooddollllccccccc:;,'...,:;,,:oldxlxOxk00000KK000KK0K0kxkklcdoco\n					,;clooolll:;'.';;:;:lokKXXXXXXXXXXXXXXXKKKKKKKXXKKKKKKKKKKK0OkOOkxxxk000Oxolccccc::;;;;;;;;;;;,'''','';,,;;;;;,::,clcolckOolodxdlkx;;c;,::,;\n					cccclddlccc::;;,';:;;:dKXKKXXKXKKKK000KKXXKKKXXXXXXXKKKKKXXXKKKKK00OOOOOOkkkxddooolcc::;;:;,,,',;;',;,,;,;,;;;;;::;;:;;;co:;;;:;;::;;;;;::::\n					;cxkxlccloo:,,....'..';oxkOKKXKK0dl::xKKXXXXXXXXXXXXKKKKXXKKXKKKKKKKKKKKKKKKKKKK00OOOOkxxxxdoolcc::;;;;codkOOxddddooooloodollllllllllllloooo\n					::o0X0xloOXXkl;col:,',;'.'lOKKK0d'...:0XXXXKKKKKXXKKKKKKKKKKKKKKXXXXXXXXXXXKXXKKKKKKKKKK0KKK00OOOkkkkkOXNNXKKK0K0000000000000000000000000KKK\n					ocloxXXkoox0NNOddkdodddxxxdxkxxkd;'.,o0KKXXKK00000OKXXXXXKXXXXKKKKKKKKKXKKKKXXKKKKKKKK00KKK0OOKKKXNWWWXXXK00KKKKKKKKKKKKKKKKKK0KK0KKK0K0KK00\n					dl:;cxOdollox0XKxl;:xKOxk0KKK00XNK0kkO0KKXNNKd:;::lkKKXXXXXXKKKKKKKKKKXXXXXXKXXKKKKKKK00KKKXXXNWWWNX00k0KK0KKKKKXKK00KKKKK00KKKKKKKKKKKKKKKK\n					:;;,,,;:;,;::lddl;,;codoc:ldkkxdk0KK0000xOXXXo...',cxOKK0KXK0KKKKKKKKKXXXXXKKKXKKKKKKKKXXNNNWNNXK00O0OO0000000KKKKK0K00000KK00KKKKKK00KKKK0K\n					::;;;;;;,;:;::::::;,;;;;;;;,;:;,,;clollooxxokx;..,,,:xOkddO0O0KKKKK00OO0KK00KKKKKXXXNWWWWNXXK0K000000000O00KK0KKKKKKK00KK0KK0OOO0000O0KK00O0\n					;::::;;:::::clccc:c:;;::ccc:ccc:,,;::;'';:;;::,.....;ddcccodxkkkO00kxocoO0kkO0000XWWWWNNNK0OOk0KK0O000KKKKKXXKXKKKXKK00000KXK000O0KKKKKKKK00\n"
    newline: .asciiz "\n"
    start_question: .asciiz "Do you want to start the game?\n"
    start_option1: .asciiz "[1] Start the game\n"
    start_option2: .asciiz "[2] Use checkpoint code\n"

.text
main:
    clearterminal
    print(prompt1)
    selection(start_question, start_option1, start_option2, startgame, checkpoint)

startgame:
    print(start_option1)
    j end

checkpoint:
    print(start_option2)
    j end

invalid_input:
    print(start_question)
    j end

end: