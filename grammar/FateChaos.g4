grammar FateChaos;

/*
 *  Parser Rules
 */

 game           : item+ EOF;

 item           : character    #playerCharacterDef
                | npc          #nonPlayerCharacterDef
                | scene        #sceneDef
                | aspect       #aspectDef
                | generate     #generateRequest
                | roll         #rollDice
                ;

 scene          : SCENE element
                    location
                    aspect*
                  end
                ;

 character      : CHARACTER name
                    high_concept 
                    trouble? 
                    attribute*
                    skills?
                  end
                ;

 npc            : NPC name
                    high_concept 
                    trouble? 
                    attribute* 
                    skills?
                  end
                ;

 generate       : GENERATE ( ASPECT | CHARACTER | SCENE | NPC )+ end*
                ;
 
 roll           : ROLL DICE;

 aspect         : ASPECT element ;

 high_concept   : HIGHCONCEPT element ;
 trouble        : TROUBLE element ;
 attribute      : ATTRIBUTE element ;
 location       : LOCATION element ;

 name           : ( TEXT | RANDOMNAME ) ;
 element        : ( TEXT | RANDOMSET | RANDOMNAME | RANDOMDESCRIPTION | RANDOMPLACE | random ) ;

 random         : RANDOMANY
                | RANDOM phrase
                | RANDOM number
                ;

 skills         : SKILLS skill+;

 skill          : ( number TEXT | RANDOMSKILL );

 number         : INT ;

 phrase         : pos+ ;
 pos            : ( TEXT | NOUN | ADJECTIVE | VERB ) ;

 end            : END;

/*
 *   Lexer Rules
 */

fragment A                  : ('A'|'a') ;
fragment B                  : ('B'|'b') ;
fragment C                  : ('C'|'c') ;
fragment D                  : ('D'|'d') ;
fragment E                  : ('E'|'e') ;
fragment F                  : ('F'|'f') ;
fragment G                  : ('G'|'g') ;
fragment H                  : ('H'|'h') ;
fragment I                  : ('I'|'i') ;
fragment J                  : ('J'|'j') ;
fragment K                  : ('K'|'k') ;
fragment L                  : ('L'|'l') ;
fragment M                  : ('M'|'m') ;
fragment N                  : ('N'|'n') ;
fragment O                  : ('O'|'o') ;
fragment P                  : ('P'|'p') ;
fragment Q                  : ('Q'|'q') ;
fragment R                  : ('R'|'r') ;
fragment S                  : ('S'|'s') ;
fragment T                  : ('T'|'t') ;
fragment U                  : ('U'|'u') ;
fragment V                  : ('V'|'v') ;
fragment X                  : ('X'|'x') ;
fragment Y                  : ('Y'|'y') ;
fragment Z                  : ('Z'|'z') ;
fragment UNDERSCORE         : '_' ;
fragment DASH               : '-' ;
fragment QUOTE              : ( '"' ) ;
fragment LINEFEED           : '\n' ;
fragment RETURN             : '\r' ;
fragment POUND              : '#' ;
fragment PLUS               : '+' ;

fragment LETTER             : [a-zA-Z] ;
fragment DIGIT              : [0-9] ;

SEP                         : ':' ;

INT                         : DIGIT+ ;
NUMBER                      : INT ( '.' INT )? ;

//WORD                        : LETTER+ ;
//PHRASE                      : WORD ( WORD | NUMBER )? ;

DICE                        : INT D INT 
                            | PLUS D INT
                            ;

TEXT                        : QUOTE ( '\\"' |  ~["] )+ QUOTE ;

// Base Commands
CHARACTER                   : C H A R A C T E R 
                            | P C 
                            ;

END                         : E N D 
                            ;

NPC                         : N P C 
                            | N C 
                            ;

CARD                        : C A R D 
                            | C D 
                            ;

ASPECT                      : A S P E C T  
                            | A A 
                            ;

HIGHCONCEPT                 : H I G H C O N C E P T 
                            | H C 
                            ;

TROUBLE                     : T R O U B L E 
                            | T R 
                            ;

RANDOM                      : R A N D O M 
                            | R N D 
                            ;

RANDOMANY                   : R A N D O M A N Y 
                            | R N D A 
                            ;

RANDOMSET                   : R A N D O M S E T
                            | R N D S 
                            ;

RANDOMNAME                  : R A N D O M N A M E
                            | R N D N 
                            ;

RANDOMPLACE                 : R A N D O M P L A C E
                            | R N D P 
                            ;

RANDOMDESCRIPTION           : R A N D O M D E S C R I P T I O N
                            | R N D D 
                            ;

RANDOMSKILL                 : R A N D O M S K I L L
                            | R N D K
                            ;

ATTRIBUTE                   : A T T R I B U T E
                            | A R
                            ;

NOUN                        : N O U N 
                            | N N 
                            ;

ADJECTIVE                   : A D J E C T I V E 
                            | A D 
                            ;

VERB                        : V E R B 
                            | V B 
                            ;

PLACE                       : P L A C E 
                            | P L 
                            ;

PERSON                      : P E R S O N 
                            | P R 
                            ;

SCENE                       : S C E N E 
                            | S C
                            ;

LOCATION                    : L O C A T I O N
                            | L N 
                            ;

GENERATE                    : G E N E R A T E
                            | G E N
                            ;

ROLL                        : R O L L
                            | R L
                            ;

SKILLS                      : S K I L L S
                            | S K L
                            ;

// Catch all
WS                          : [ \t\r\n] -> skip ;
COMMENT                     : POUND ~( '\r' | '\n' )* -> skip ; 
ANY                         : . ;