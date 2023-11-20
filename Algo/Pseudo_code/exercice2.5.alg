<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER D"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2para="" F2lignes="" F2etat="inactif" F2defaut=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param totalBoucles="5000000" arrondiAuto="vrai" maxBoucle="500000" totalAffichages="1000" epaisseurLigne="2" nbDecimales="8" epaisseurPoint="2"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#N" algoitem="N EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#D" algoitem="D EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#saisir le chiffre : #0" algoitem="AFFICHER &quot;saisir le chiffre : &quot;"/>
        <item code="2#N#pasliste" algoitem="LIRE N"/>
        <item code="12#D#2#N-1" algoitem="POUR D ALLANT_DE 2 A N-1">
            <item code="13#debutpour" algoitem="DEBUT_POUR"/>
            <item code="6#N%D ==0" algoitem="SI (N%D ==0) ALORS">
                <item code="7#debutsi" algoitem="DEBUT_SI"/>
                <item code="4#à pour diviseur : #0" algoitem="AFFICHER &quot;à pour diviseur : &quot;"/>
                <item code="3#D#1#pasliste" algoitem="AFFICHER D"/>
                <item code="8#finsi" algoitem="FIN_SI"/>
            </item>
            <item code="14#finpour" algoitem="FIN_POUR"/>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
