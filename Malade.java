public class Malade extends Element
{
    MALADE (NUMERO, NOM, PRENOM, TEL, ADRESSE, MUTUELLE)
    numero decimal (4) primary key,
    nom varchar (12) not null,
    prenom varchar (12) not null,
    adresse varchar (40),
   // tel char (14),
    mutuelle varchar (6),
}