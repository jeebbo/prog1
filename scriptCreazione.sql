-------------------------------
------ creazione tabelle ------

CREATE TABLE PLAYER(
  Username  VARCHAR2(50) PRIMARY KEY,
  numWins   NUMBER,
  numGames  NUMBER );
/
CREATE TABLE GAME(
  codGm   NUMBER PRIMARY KEY,
  GDate   DATE,
  numPl   NUMBER CHECK (numPl>1 AND numPl<7),
  Winner  VARCHAR2(50));
/
CREATE TABLE RECAP(
  Game    NUMBER       NOT NULL,
  Player  VARCHAR2(50) NOT NULL,
  Colour  NUMBER       NOT NULL,
  Goal    NUMBER       NOT NULL,
  myTurn  NUMBER       NOT NULL
  );
/
CREATE TABLE GOALCARD(
  codGoal NUMBER        PRIMARY KEY,
  Details VARCHAR2(500) NOT NULL
  );
/
CREATE TABLE TURN(
  codTr  NUMBER       PRIMARY KEY,
  NTurn  NUMBER       NOT NULL,
  currPl VARCHAR2(50) NOT NULL,
  OFGame NUMBER       NOT NULL
  );
/
CREATE TABLE TERRITORYCARD(
  codCard NUMBER       PRIMARY KEY,
  Bonus_t VARCHAR2(10)  NOT NULL,
  TCName  VARCHAR2(25)  
  );
/
CREATE TABLE TERRITORY(
  TName     VARCHAR2(25) PRIMARY KEY,
  Continent VARCHAR2(20) NOT NULL
  );
/
CREATE TABLE BORDER(
  TName1 VARCHAR2(25) NOT NULL,
  TName2 VARCHAR2(25) NOT NULL
  );
/
CREATE TABLE HAND(
  H_Turn     NUMBER NOT NULL,
  Card     NUMBER NOT NULL,
  Holder   VARCHAR2(50) NOT NULL  
  );
/
CREATE TABLE BATTLE(
  redDice  VARCHAR2(7) NOT NULL,
  blueDice VARCHAR2(7) NOT NULL,
  Striker  NUMBER      NOT NULL,
  Defender NUMBER      NOT NULL,
  NBattle  NUMBER      NOT NULL
  );
/
CREATE TABLE OWNERSHIP(
  codOwn    NUMBER        PRIMARY KEY,
  Territory VARCHAR2(25)  NOT NULL,
  Owner     VARCHAR2(50)  NOT NULL,
  numArmies NUMBER        NOT NULL,
  O_Turn    NUMBER      NOT NULL
  );
/
CREATE TABLE COLOUR(
  CODCL     NUMBER 	       PRIMARY KEY,
  COLOUR_T  VARCHAR2(6) NOT NULL 
  );

/
-------------------------------
------ creazione vincoli ------

ALTER TABLE GAME
  ADD CONSTRAINT winner_fk FOREIGN KEY ( Winner ) REFERENCES Player( Username );
/
ALTER TABLE TURN
  ADD CONSTRAINT game_fk1 FOREIGN KEY ( OFGame ) REFERENCES Game( codGm ) ON DELETE CASCADE;
ALTER TABLE TURN
  ADD CONSTRAINT player_fk1 FOREIGN KEY ( currPl ) REFERENCES Player( Username );
/
ALTER TABLE RECAP
  ADD CONSTRAINT game_fk2 FOREIGN KEY ( Game ) REFERENCES GAME( codGm ) ON DELETE CASCADE;
/
ALTER TABLE RECAP 
  ADD CONSTRAINT player_fk2 FOREIGN KEY ( Player ) REFERENCES PLAYER( Username )
  ADD CONSTRAINT goal_fk FOREIGN KEY ( Goal ) REFERENCES GOALCARD( codGoal )
  ADD CONSTRAINT colour_fk FOREIGN KEY ( Colour ) REFERENCES COLOUR( codCl );
/
ALTER TABLE TERRITORYCARD
  ADD CONSTRAINT tname_fk FOREIGN KEY ( TCName ) REFERENCES TERRITORY( TName );
/
ALTER TABLE BORDER
  ADD CONSTRAINT territory_fk1 FOREIGN KEY ( TName1 ) REFERENCES TERRITORY( TName )
  ADD CONSTRAINT territory_fk2 FOREIGN KEY ( TName2 ) REFERENCES TERRITORY( TName );
/
ALTER TABLE OWNERSHIP
  ADD CONSTRAINT territory_fk3 FOREIGN KEY ( Territory ) REFERENCES TERRITORY( TName )
  ADD CONSTRAINT owner_fk FOREIGN KEY ( Owner ) REFERENCES PLAYER( Username );
/
ALTER TABLE OWNERSHIP
  ADD CONSTRAINT turn_fk FOREIGN KEY ( O_Turn ) REFERENCES TURN( codTr ) ON DELETE CASCADE;
/
ALTER TABLE BATTLE
  ADD CONSTRAINT striker_fk FOREIGN KEY ( Striker ) REFERENCES OWNERSHIP( codOwn ) ON DELETE CASCADE;
/
ALTER TABLE BATTLE
  ADD CONSTRAINT defender_fk FOREIGN KEY ( Defender ) REFERENCES OWNERSHIP( codOwn ) ON DELETE CASCADE;
/
ALTER TABLE BATTLE
  ADD CONSTRAINT different_ck CHECK ( Striker != Defender );
/
ALTER TABLE HAND
  ADD CONSTRAINT card_fk FOREIGN KEY ( Card ) REFERENCES TERRITORYCARD( codCard )
  ADD CONSTRAINT player_fk FOREIGN KEY ( Holder ) REFERENCES PLAYER( Username );
/
ALTER TABLE HAND
  ADD CONSTRAINT turn_fk2 FOREIGN KEY ( H_Turn ) REFERENCES TURN( codTr ) ON DELETE CASCADE;
/
ALTER TABLE RECAP
ADD CONSTRAINT RECAP_UK1 UNIQUE 
	( GAME, PLAYER )
ADD CONSTRAINT RECAP_UK2 UNIQUE
	( GAME, COLOUR )
ADD CONSTRAINT RECAP_UK3 UNIQUE
	( GAME, MYTURN ) 
ENABLE;
/
ALTER TABLE TERRITORYCARD
	ADD CONSTRAINT bonus_ck CHECK 
	(Bonus_t IN ('Fante', 'Cannone', 'Cavaliere', 'Jolly'))
	ENABLE;

/
--------------------------------
------ creazione sequenze ------

CREATE SEQUENCE count_game
  INCREMENT BY 1
  START WITH  1;

/

CREATE SEQUENCE count_turn
  INCREMENT BY 1
  START WITH  1;

/
CREATE SEQUENCE count_own
  INCREMENT BY 1
  START WITH  1;

/
---------------------------------
------ popolamento tabelle ------

INSERT INTO COLOUR VALUES ( 0 , 'Blu');
INSERT INTO COLOUR VALUES ( 1 , 'Rosso');
INSERT INTO COLOUR VALUES ( 2 , 'Nero');
INSERT INTO COLOUR VALUES ( 3 , 'Giallo');
INSERT INTO COLOUR VALUES ( 4 , 'Verde');
INSERT INTO COLOUR VALUES ( 5 , 'Viola');

/

INSERT INTO GOALCARD VALUES ( 0 , 'Conquistare 18 territori presidiandoli con almeno 2 armate ciascuno' );
INSERT INTO GOALCARD VALUES ( 1 , 'Conquistare 24 territori' );
INSERT INTO GOALCARD VALUES ( 2 , 'Conquistare la totalità di Nord America e Africa' );
INSERT INTO GOALCARD VALUES ( 3 , 'Conquistare la totalità di Nord America e Oceania' );
INSERT INTO GOALCARD VALUES ( 4 , 'Conquistare la totalità di Asia e Sud America' );
INSERT INTO GOALCARD VALUES ( 5 , 'Conquistare la totalità di Asia e Africa' );
INSERT INTO GOALCARD VALUES ( 6 , 'Conquistare la totalità di Europa, Sud America e un terzo continente a scelta' );
INSERT INTO GOALCARD VALUES ( 7 , 'Conquistare la totalità di Europa, Oceania e un terzo continente a scelta' );
INSERT INTO GOALCARD VALUES ( 8 , 'Distruggere completamente le armate blu');
INSERT INTO GOALCARD VALUES ( 9 , 'Distruggere completamente le armate rosse');
INSERT INTO GOALCARD VALUES ( 10 , 'Distruggere completamente le armate nere');
INSERT INTO GOALCARD VALUES ( 11 , 'Distruggere completamente le armate gialle');
INSERT INTO GOALCARD VALUES ( 12 , 'Distruggere completamente le armate verdi');
INSERT INTO GOALCARD VALUES ( 13 , 'Distruggere completamente le armate viola');

/

INSERT INTO TERRITORY VALUES ('India', 'Asia');
INSERT INTO TERRITORY VALUES ('Alaska', 'Nord America');
INSERT INTO TERRITORY VALUES ('Australia Orientale', 'Oceania');
INSERT INTO TERRITORY VALUES ('Giappone', 'Asia');
INSERT INTO TERRITORY VALUES ('Afghanistan', 'Asia');
INSERT INTO TERRITORY VALUES ('Egitto', 'Africa');
INSERT INTO TERRITORY VALUES ('Eur Occidentale', 'Europa');
INSERT INTO TERRITORY VALUES ('Argentina', 'Sud America');
INSERT INTO TERRITORY VALUES ('Islanda', 'Europa');
INSERT INTO TERRITORY VALUES ('Madagascar', 'Africa');
INSERT INTO TERRITORY VALUES ('US Occidentali', 'Nord America');
INSERT INTO TERRITORY VALUES ('Alberta', 'Nord America');
INSERT INTO TERRITORY VALUES ('Cita', 'Asia');
INSERT INTO TERRITORY VALUES ('Africa del Nord', 'Africa');
INSERT INTO TERRITORY VALUES ('Mongolia', 'Asia');
INSERT INTO TERRITORY VALUES ('Africa del Sud', 'Africa');
INSERT INTO TERRITORY VALUES ('Siam', 'Asia');
INSERT INTO TERRITORY VALUES ('Africa Orientale', 'Africa');
INSERT INTO TERRITORY VALUES ('Venezuela', 'Asia');
INSERT INTO TERRITORY VALUES ('Australia Occidentale', 'Oceania');
INSERT INTO TERRITORY VALUES ('Quebec', 'Nord America');
INSERT INTO TERRITORY VALUES ('Siberia', 'Asia');
INSERT INTO TERRITORY VALUES ('Brasile', 'Sud America');
INSERT INTO TERRITORY VALUES ('US Orientali', 'Nord America');
INSERT INTO TERRITORY VALUES ('Medio Oriente', 'Asia');
INSERT INTO TERRITORY VALUES ('Scandinavia', 'Europa');
INSERT INTO TERRITORY VALUES ('Ucraina', 'Europa');
INSERT INTO TERRITORY VALUES ('Territori del Nord-Ovest', 'Nord America');
INSERT INTO TERRITORY VALUES ('Indonesia', 'Oceania');
INSERT INTO TERRITORY VALUES ('Eur Settentrionale', 'Europa');
INSERT INTO TERRITORY VALUES ('Eur Meridionale', 'Europa');
INSERT INTO TERRITORY VALUES ('Gran Bretagna', 'Europa');
INSERT INTO TERRITORY VALUES ('Urali', 'Asia');
INSERT INTO TERRITORY VALUES ('Groenlandia', 'Nord America');
INSERT INTO TERRITORY VALUES ('Perù', 'Sud America');
INSERT INTO TERRITORY VALUES ('Congo', 'Africa');
INSERT INTO TERRITORY VALUES ('Ontario', 'Nord America');
INSERT INTO TERRITORY VALUES ('Kamchatka', 'Asia');
INSERT INTO TERRITORY VALUES ('Jacuzia', 'Asia');
INSERT INTO TERRITORY VALUES ('Cina', 'Asia');
INSERT INTO TERRITORY VALUES ('Nuova Guinea', 'Oceania');
INSERT INTO TERRITORY VALUES ('America Centrale', 'Nord America');

/

INSERT INTO BORDER VALUES ('Gran Bretagna', 'Islanda'); 
INSERT INTO BORDER VALUES ('Gran Bretagna', 'Scandinavia');
INSERT INTO BORDER VALUES ('Gran Bretagna', 'Eur Settentrionale'); 
INSERT INTO BORDER VALUES ('Gran Bretagna', 'Eur Occidentale');
INSERT INTO BORDER VALUES ('Eur Occidentale', 'Eur Settentrionale');
INSERT INTO BORDER VALUES ('Eur Occidentale', 'Eur Meridionale');
INSERT INTO BORDER VALUES ('Eur Occidentale', 'Africa del Nord');
INSERT INTO BORDER VALUES ('Eur Meridionale', 'Eur Settentrionale');
INSERT INTO BORDER VALUES ('Eur Meridionale', 'Ucraina');
INSERT INTO BORDER VALUES ('Eur Meridionale', 'Medio Oriente');
INSERT INTO BORDER VALUES ('Eur Meridionale', 'Egitto');
INSERT INTO BORDER VALUES ('Eur Settentrionale', 'Scandinavia');
INSERT INTO BORDER VALUES ('Eur Settentrionale', 'Ucraina');
INSERT INTO BORDER VALUES ('Scandinavia', 'Ucraina');
INSERT INTO BORDER VALUES ('Scandinavia', 'Islanda');
INSERT INTO BORDER VALUES ('Groenlandia', 'Islanda');
INSERT INTO BORDER VALUES ('Ucraina', 'Urali');
INSERT INTO BORDER VALUES ('Ucraina', 'Medio Oriente');
INSERT INTO BORDER VALUES ('Ucraina', 'Afghanistan');
INSERT INTO BORDER VALUES ('Egitto', 'Medio Oriente');
INSERT INTO BORDER VALUES ('Egitto', 'Africa Orientale');
INSERT INTO BORDER VALUES ('Egitto', 'Africa del Nord');
INSERT INTO BORDER VALUES ('Africa Orientale', 'Africa del Nord');
INSERT INTO BORDER VALUES ('Congo', 'Africa del Nord');
INSERT INTO BORDER VALUES ('Brasile', 'Africa del Nord');
INSERT INTO BORDER VALUES ('Congo', 'Africa del Sud');
INSERT INTO BORDER VALUES ('Congo', 'Africa Orientale');
INSERT INTO BORDER VALUES ('Africa Orientale', 'Africa del Sud');
INSERT INTO BORDER VALUES ('Africa Orientale', 'Madagascar');
INSERT INTO BORDER VALUES ('Madagascar', 'Africa del Sud');
INSERT INTO BORDER VALUES ('Brasile', 'Venezuela');
INSERT INTO BORDER VALUES ('Brasile', 'Argentina');
INSERT INTO BORDER VALUES ('Brasile', 'Perù');
INSERT INTO BORDER VALUES ('Argentina', 'Perù');
INSERT INTO BORDER VALUES ('Venezuela', 'Perù');
INSERT INTO BORDER VALUES ('Venezuela', 'America Centrale');
INSERT INTO BORDER VALUES ('US Orientali', 'America Centrale');
INSERT INTO BORDER VALUES ('US Occidentali', 'America Centrale');
INSERT INTO BORDER VALUES ('US Occidentali', 'Quebec');
INSERT INTO BORDER VALUES ('US Occidentali', 'Ontario');
INSERT INTO BORDER VALUES ('US Occidentali', 'US Orientali');
INSERT INTO BORDER VALUES ('Groenlandia', 'Quebec');
INSERT INTO BORDER VALUES ('Ontario', 'Quebec');
INSERT INTO BORDER VALUES ('Ontario', 'Groenlandia');
INSERT INTO BORDER VALUES ('Territori del Nord-Ovest', 'Groenlandia');
INSERT INTO BORDER VALUES ('Territori del Nord-Ovest', 'Ontario');
INSERT INTO BORDER VALUES ('Alberta', 'Ontario');
INSERT INTO BORDER VALUES ('Alberta', 'Territori del Nord-Ovest');
INSERT INTO BORDER VALUES ('Alberta', 'US Occidentali');
INSERT INTO BORDER VALUES ('Alberta', 'Alaska');
INSERT INTO BORDER VALUES ('Kamchatka', 'Alaska');
INSERT INTO BORDER VALUES ('Eur Meridionale', 'Africa del Nord');
INSERT INTO BORDER VALUES ('Kamchatka', 'Giappone');
INSERT INTO BORDER VALUES ('Kamchatka', 'Mongolia');
INSERT INTO BORDER VALUES ('Kamchatka', 'Cita');
INSERT INTO BORDER VALUES ('Kamchatka', 'Jacuzia');
INSERT INTO BORDER VALUES ('Cita', 'Jacuzia');
INSERT INTO BORDER VALUES ('Siberia', 'Jacuzia');
INSERT INTO BORDER VALUES ('Siberia', 'Urali');
INSERT INTO BORDER VALUES ('Siberia', 'Cina');
INSERT INTO BORDER VALUES ('Siberia', 'Mongolia');
INSERT INTO BORDER VALUES ('Siberia', 'Cita');
INSERT INTO BORDER VALUES ('Afghanistan', 'Urali');
INSERT INTO BORDER VALUES ('Cina', 'Urali');
INSERT INTO BORDER VALUES ('Afghanistan', 'Cina');
INSERT INTO BORDER VALUES ('Afghanistan', 'Medio Oriente');
INSERT INTO BORDER VALUES ('Cina', 'Medio Oriente');
INSERT INTO BORDER VALUES ('India', 'Medio Oriente');
INSERT INTO BORDER VALUES ('India', 'Cina');
INSERT INTO BORDER VALUES ('India', 'Siam');
INSERT INTO BORDER VALUES ('Cina', 'Siam');
INSERT INTO BORDER VALUES ('Cina', 'Mongolia');
INSERT INTO BORDER VALUES ('Giappone', 'Mongolia');
INSERT INTO BORDER VALUES ('Cita', 'Mongolia');
INSERT INTO BORDER VALUES ('Indonesia', 'Siam');
INSERT INTO BORDER VALUES ('Indonesia', 'Nuova Guinea');
INSERT INTO BORDER VALUES ('Indonesia', 'Australia Occidentale');
INSERT INTO BORDER VALUES ('Australia Orientale', 'Australia Occidentale');
INSERT INTO BORDER VALUES ('Australia Orientale', 'Nuova Guinea');
INSERT INTO BORDER VALUES ('Australia Occidentale', 'Nuova Guinea');

/

INSERT INTO TERRITORYCARD VALUES (0, 'Fante', 'India');
INSERT INTO TERRITORYCARD VALUES (1, 'Fante', 'Alaska');
INSERT INTO TERRITORYCARD VALUES (2, 'Fante', 'Australia Orientale');
INSERT INTO TERRITORYCARD VALUES (3, 'Fante', 'Giappone');
INSERT INTO TERRITORYCARD VALUES (4, 'Fante', 'Afghanistan');
INSERT INTO TERRITORYCARD VALUES (5, 'Fante', 'Egitto');
INSERT INTO TERRITORYCARD VALUES (6, 'Fante', 'Eur Occidentale');
INSERT INTO TERRITORYCARD VALUES (7, 'Fante', 'Argentina');
INSERT INTO TERRITORYCARD VALUES (8, 'Fante', 'Islanda');
INSERT INTO TERRITORYCARD VALUES (9, 'Fante', 'Madagascar');
INSERT INTO TERRITORYCARD VALUES (10, 'Fante', 'US Occidentali');
INSERT INTO TERRITORYCARD VALUES (11, 'Fante', 'Alberta');
INSERT INTO TERRITORYCARD VALUES (12, 'Fante', 'Cita');
INSERT INTO TERRITORYCARD VALUES (13, 'Fante', 'Africa del Nord');
INSERT INTO TERRITORYCARD VALUES (14, 'Cannone', 'Mongolia');
INSERT INTO TERRITORYCARD VALUES (15, 'Cannone', 'Africa del Sud');
INSERT INTO TERRITORYCARD VALUES (16, 'Cannone', 'Siam');
INSERT INTO TERRITORYCARD VALUES (17, 'Cannone', 'Africa Orientale');
INSERT INTO TERRITORYCARD VALUES (18, 'Cannone', 'Venezuela');
INSERT INTO TERRITORYCARD VALUES (19, 'Cannone', 'Australia Occidentale');
INSERT INTO TERRITORYCARD VALUES (20, 'Cannone', 'Quebec');
INSERT INTO TERRITORYCARD VALUES (21, 'Cannone', 'Siberia');
INSERT INTO TERRITORYCARD VALUES (22, 'Cannone', 'Brasile');
INSERT INTO TERRITORYCARD VALUES (23, 'Cannone', 'US Orientali');
INSERT INTO TERRITORYCARD VALUES (24, 'Cannone', 'Medio Oriente');
INSERT INTO TERRITORYCARD VALUES (25, 'Cannone', 'Scandinavia');
INSERT INTO TERRITORYCARD VALUES (26, 'Cannone', 'Ucraina');
INSERT INTO TERRITORYCARD VALUES (27, 'Cannone', 'Territori del Nord-Ovest');
INSERT INTO TERRITORYCARD VALUES (28, 'Cavaliere', 'Indonesia');
INSERT INTO TERRITORYCARD VALUES (29, 'Cavaliere', 'Eur Settentrionale');
INSERT INTO TERRITORYCARD VALUES (30, 'Cavaliere', 'Eur Meridionale');
INSERT INTO TERRITORYCARD VALUES (31, 'Cavaliere', 'Gran Bretagna');
INSERT INTO TERRITORYCARD VALUES (32, 'Cavaliere', 'Urali');
INSERT INTO TERRITORYCARD VALUES (33, 'Cavaliere', 'Groenlandia');
INSERT INTO TERRITORYCARD VALUES (34, 'Cavaliere', 'Perù');
INSERT INTO TERRITORYCARD VALUES (35, 'Cavaliere', 'Congo');
INSERT INTO TERRITORYCARD VALUES (36, 'Cavaliere', 'Ontario');
INSERT INTO TERRITORYCARD VALUES (37, 'Cavaliere', 'Kamchatka');
INSERT INTO TERRITORYCARD VALUES (38, 'Cavaliere', 'Jacuzia');
INSERT INTO TERRITORYCARD VALUES (39, 'Cavaliere', 'Cina');
INSERT INTO TERRITORYCARD VALUES (40, 'Cavaliere', 'Nuova Guinea');
INSERT INTO TERRITORYCARD VALUES (41, 'Cavaliere', 'America Centrale');
INSERT INTO TERRITORYCARD VALUES (42, 'Jolly', NULL);
INSERT INTO TERRITORYCARD VALUES (43, 'Jolly', NULL);

/
-----------------------------------------------
-------- funzioni chiamate dai trigger --------

---- ordinamento stringa dei dadi ----
create or replace FUNCTION dice_sort( dice IN OUT VARCHAR2 )
  RETURN VARCHAR2 IS
  curr_i CHAR(1); curr_c CHAR(1); curr_j CHAR(1); curr_max CHAR(1); curr_min CHAR(1);
  BEGIN
      /* I valori sono separati da virgole */             
      curr_i := substr( dice , 1 , 1 );
      curr_max := curr_i; curr_min := curr_i;
      curr_c:=curr_i;
      FOR j IN 2..3 LOOP
        curr_j := substr( dice , (j*2)-1 , 1 );       
        IF curr_j > curr_max THEN
          IF curr_max != curr_c THEN curr_c :=curr_max; END IF;
          curr_max := curr_j;
          
        ELSE if curr_j < curr_min  THEN
          IF curr_min != curr_c THEN curr_c :=curr_min; END IF;
          curr_min := curr_j;
        ELSE
          curr_c := curr_j;
        END IF;
        END IF;       
      END LOOP;
      /*---swap---*/
      dice := (curr_max || ','||curr_c || ','||curr_min);   
    RETURN dice;
  END;
  
/
---- elimina le armate da un territorio ----
create or replace FUNCTION kill_armies( n NUMBER , fighter OWNERSHIP.codOwn%TYPE )
  RETURN OWNERSHIP%ROWTYPE IS
  owner OWNERSHIP%ROWTYPE;
  armies NUMBER;
  BEGIN
    SELECT O.numArmies INTO armies
    FROM OWNERSHIP O
    WHERE O.codOwn = fighter;
    armies := armies - n;
    IF armies < 0 THEN
      armies := 0;
    END IF;
    UPDATE OWNERSHIP SET numarmies = armies
    WHERE codown = fighter;
    SELECT * INTO owner
    FROM OWNERSHIP O
    WHERE O.codOwn = fighter;
    RETURN owner;
  END;

/
---- verifica se il giocatore deve eliminare se stesso ----
create or replace FUNCTION kill_my_self( tuple RECAP%ROWTYPE )
  RETURN BOOLEAN IS
  BEGIN
      RETURN (tuple.goal = (tuple.colour + 8));
  END;

/
---- verifica se il giocatore deve eliminare un colore assente ----
create or replace FUNCTION kill_nobody( tuple RECAP%ROWTYPE )
  RETURN BOOLEAN IS
  colour RECAP.colour%TYPE;
  ck BOOLEAN;
  CURSOR cur IS (SELECT R.colour FROM RECAP R
                 WHERE tuple.game = R.game);
  BEGIN
    OPEN cur;
    LOOP
      FETCH cur INTO colour;
      EXIT WHEN cur%NOTFOUND OR ck;
      ck := (tuple.goal - 8 = colour);
    END LOOP;
    RETURN not ck;
  END;

/
---- verifica degli obiettivi: elimina l'armata <colore> ----
create or replace FUNCTION elimination( w GAME.winner%TYPE , cc RECAP.colour%TYPE, last_turn TURN.codTr%TYPE, gg RECAP.GAME%TYPE )
  RETURN BOOLEAN IS
  loser RECAP.player%TYPE;
  army NUMBER;
  n_terr NUMBER;
  BEGIN
    SELECT R.Player INTO loser FROM RECAP R 
    WHERE R.colour = cc AND R.game = gg;
    
    SELECT SUM(O.numarmies) INTO army
    FROM OWNERSHIP O
    WHERE O.owner = loser AND O.O_turn = last_turn;
    IF army = 0 THEN
      RETURN TRUE;
    ELSE
      RETURN FALSE;
    END IF;
    EXCEPTION WHEN NO_DATA_FOUND THEN
      DBMS_OUTPUT.PUT_LINE('Obiettivo cambiato in -conquista 24 territori-');
      SELECT COUNT(O.codOwn) INTO n_terr
      FROM OWNERSHIP O WHERE O.O_turn = last_turn AND O.owner = w;
      RETURN (n_terr > 23);
  END;

/

CREATE OR REPLACE FUNCTION n_continents( cont VARCHAR2, w GAME.winner%TYPE , last_turn TURN.codTr%TYPE , tot NUMBER  )
  RETURN BOOLEAN IS
  n_terr NUMBER;
  BEGIN
    SELECT COUNT(O.codOwn) INTO n_terr
    FROM OWNERSHIP O JOIN TERRITORY T on O.territory = T.tname
    WHERE (T.Continent = cont) AND O.O_turn = last_turn AND O.owner = w;
    RETURN (n_terr = tot);
  END;
  
/
  
CREATE OR REPLACE FUNCTION goal_respected( W GAME.winner%TYPE , G GOALCARD.codgoal%TYPE , T TURN.codTr%TYPE  )
  RETURN BOOLEAN IS
  B BOOLEAN;
  curr_gm NUMBER;
  n_terr NUMBER;
  BEGIN
    IF G = 0 THEN
      SELECT COUNT(O.codOwn) INTO n_terr FROM OWNERSHIP O
      WHERE O.O_turn = T AND O.owner = W AND O.numArmies > 1;
      B := (n_terr > 17);
    ELSIF G = 1 THEN
      SELECT COUNT(O.codOwn) INTO n_terr
      FROM OWNERSHIP O WHERE O.O_turn = T AND O.owner = W;
      B := (n_terr > 23);
    ELSIF G = 2 THEN
      B := n_continents( 'Nord America' , W , T , 9 ) AND n_continents( 'Africa' , W , T , 6 );
    ELSIF G = 3 THEN
      B := n_continents( 'Nord America' , W , T , 9 ) AND n_continents( 'Oceania' , W , T , 4 );
    ELSIF G = 4 THEN
      B := n_continents( 'Sud America' , W , T , 4 ) AND n_continents( 'Asia' , W , T , 12 );
    ELSIF G = 5 THEN
      B := n_continents( 'Asia' , W , T , 12 ) AND n_continents( 'Africa' , W , T , 6 );
    ELSIF G = 6 THEN
      B := n_continents( 'Europa' , W , T , 7 ) AND n_continents( 'Sud America' , W , T , 4 );
      IF B THEN
        B := n_continents( 'Nord America' , W , T , 9 ) OR n_continents( 'Asia' , W , T , 12 )
               OR n_continents( 'Oceania' , W , T , 4 ) OR n_continents( 'Africa' , W , T , 6 );
      END IF;
    ELSIF G = 7 THEN 
      B := n_continents( 'Europa' , W , T , 7 ) AND n_continents( 'Oceania' , W , T , 4 );
      IF B THEN
        B := n_continents( 'Nord America' , W , T , 9 ) OR n_continents( 'Asia' , W , T , 12 )
               OR n_continents( 'Sud America' , W , T , 4 ) OR n_continents( 'Africa' , W , T , 6 );
      END IF;
    ELSE
      SELECT TR.OFGame INTO curr_gm FROM TURN TR WHERE TR.codTr = T;
      FOR I IN 0..5 LOOP
        IF G = I + 8 THEN
          B := elimination ( W , I , T , curr_gm );
        END IF;
      END LOOP;
    END IF;
    RETURN B;
  END;
/
---- verifica se la carta in input è già in mano a qualcuno, in quel turno ----
CREATE OR REPLACE FUNCTION not_duplicate( C TERRITORYCARD.codCard%TYPE , T TURN.codTr%TYPE )
  RETURN BOOLEAN IS
  card TERRITORYCARD.codCard%TYPE;
  BEGIN
    SELECT H.Card INTO card
    FROM HAND H
    WHERE H.H_Turn = T AND H.Card = C;
    RETURN FALSE;
    EXCEPTION WHEN NO_DATA_FOUND THEN
      RETURN TRUE;
  END;
/


---- copia tabelle possedimenti e mani del turno precedente ----
create or replace FUNCTION next_turn( oldTurn TURN.CODTR%TYPE )
    RETURN TURN.CODTR%TYPE AS
    CURSOR crs_h IS
      SELECT H.Card, H.Holder FROM HAND H
      WHERE H.H_Turn = oldTurn;
    CURSOR crs_o IS
      SELECT  O.Territory, O.Owner, O.numArmies  FROM OWNERSHIP O
      WHERE O.O_Turn = oldTurn AND O.numArmies > 0;
      m NUMBER; n NUMBER; l NUMBER;
      p RECAP.Player%TYPE;
      g RECAP.Game%TYPE;
      T TURN.codTr%TYPE;
    BEGIN
      SELECT T2.nTurn into m
      FROM TURN T2 JOIN RECAP R2 ON T2.OfGame = R2.Game AND T2.CurrPl = R2.Player
      WHERE T2.codTr = oldTurn;
      
      SELECT MAX(myTurn) into n
      FROM RECAP
      WHERE Game = (SELECT ofGame FROM TURN WHERE codTr = oldTurn);
    
      l := MOD( m , n ) + 1;
      
      SELECT Player into p
      FROM RECAP
      WHERE Game = (SELECT ofGame FROM TURN WHERE codTr = oldTurn) AND myTurn = l;
      SELECT Game into g
      FROM RECAP
      WHERE Game = (SELECT ofGame FROM TURN WHERE codTr = oldTurn) AND myTurn = l;

      T := count_turn.NEXTVAL;
      
      INSERT INTO TURN VALUES( T , m+1 , p , g );
      
      FOR I IN crs_h LOOP
        INSERT INTO HAND VALUES
          ( T , I.card , I.Holder );
      END LOOP;
      FOR J IN crs_o LOOP
        INSERT INTO OWNERSHIP VALUES
          ( count_own.NEXTVAL , J.Territory , J.Owner , J.numArmies , T );
      END LOOP;
      RETURN T;
    END;
/
---------------------------------------
---------- creazione trigger ----------

---- verifica che il giocatore abbia effettivamente realizzato l'obiettivo ----
create or replace TRIGGER winner_constraint
  BEFORE UPDATE OF winner ON game
  FOR EACH ROW
  BEGIN 
  DECLARE
    g_val NUMBER;
    last_turn NUMBER;
  BEGIN
       SELECT R.Goal INTO g_val FROM RECAP R
       WHERE R.game = :OLD.codGm AND R.player = :NEW.winner;
       
       SELECT MAX(nTurn) INTO last_turn
       FROM TURN
       WHERE OFgame = :OLD.codGm;
       
       IF NOT goal_respected( :NEW.winner , g_val , last_turn ) THEN
         :NEW.winner := :OLD.winner;
       ELSE
         UPDATE PLAYER SET numwins = numwins + 1
         WHERE username = :NEW.winner;
       END IF;
        
   END;
 END;
 
 /
---- verifica legalità dell'obiettivo assegnato ----
create or replace TRIGGER change_goal
  BEFORE UPDATE OF numPl ON GAME
  FOR EACH ROW
  BEGIN
    DECLARE
      CURSOR curr IS (SELECT * FROM RECAP R 
                      WHERE R.game= :OLD.codGm);
    BEGIN
      FOR i IN curr LOOP
        IF (i.goal > 7) and (kill_my_self( i ) OR kill_nobody( i )) THEN
          UPDATE RECAP SET goal = 1
          WHERE player = i.player AND game = i.game;
        END IF;
      END LOOP;
    END;
  END;
  
/
---- gestione nuova battaglia ----
create or replace TRIGGER battle_manage
BEFORE INSERT ON BATTLE
FOR EACH ROW
BEGIN
  DECLARE
    blue NUMBER := 0;
    red NUMBER := 0;
    strike OWNERSHIP%ROWTYPE;
    defend OWNERSHIP%ROWTYPE;
  BEGIN
    :NEW.redDice := dice_sort( :NEW.redDice );
    :NEW.blueDice := dice_sort( :NEW.blueDice );
    FOR i IN 1..3 LOOP
      IF substr(:NEW.redDice, (i*2)-1, 1) > substr(:NEW.blueDice ,(i*2)-1, 1) and  
      substr(:NEW.redDice, (i*2)-1, 1) > 0 and substr(:NEW.blueDice ,(i*2)-1, 1) > 0 THEN
        blue := blue + 1;
      ELSE
        red := red + 1;
      END IF;
    END LOOP;
    defend := kill_armies( blue , :NEW.defender );
    strike := kill_armies( red , :NEW.striker );
    IF defend.numArmies = 0 THEN
      INSERT INTO OWNERSHIP VALUES
        ( count_own.NEXTVAL , defend.Territory , strike.Owner , 1 , defend.O_Turn );
      UPDATE OWNERSHIP SET numArmies = numArmies - 1
             WHERE CODOWN = :NEW.striker;
    END IF;
  END;
END;