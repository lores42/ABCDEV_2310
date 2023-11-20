<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="AFFICHER a" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2para="" F2etat="inactif" F2lignes="" F2defaut=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param epaisseurPoint="2" nbDecimales="8" epaisseurLigne="2" totalAffichages="1000" arrondiAuto="vrai" maxBoucle="500000" totalBoucles="5000000"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="a EST_DU_TYPE NOMBRE" code="1#NOMBRE#a"/>
        <item algoitem="b EST_DU_TYPE NOMBRE" code="1#NOMBRE#b"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;saisir nombre a&quot;" code="4#saisir nombre a#0"/>
        <item algoitem="LIRE a" code="2#a#pasliste"/>
        <item algoitem="AFFICHER &quot;saisir nombre b&quot;" code="4#saisir nombre b#0"/>
        <item algoitem="LIRE b" code="2#b#pasliste"/>
        <item algoitem="SI (a>b) ALORS" code="6#a>b">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="AFFICHER b" code="3#b#0#pasliste"/>
            <item algoitem="AFFICHER &quot;-&quot;" code="4#-#0"/>
            <item algoitem="AFFICHER a" code="3#a#1#pasliste"/>
            <item algoitem="FIN_SI" code="8#finsi"/>
            <item algoitem="SINON" code="9#sinon">
                <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                <item algoitem="AFFICHER a" code="3#a#0#pasliste"/>
                <item algoitem="AFFICHER &quot;-&quot;" code="4#-#0"/>
                <item algoitem="AFFICHER b" code="3#b#0#pasliste"/>
                <item algoitem="FIN_SINON" code="11#finsinon"/>
            </item>
        </item>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
