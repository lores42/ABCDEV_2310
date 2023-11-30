<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER b"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2para="" F2etat="inactif" F2defaut="" F2lignes=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param maxBoucle="500000" totalAffichages="1000" epaisseurLigne="2" epaisseurPoint="2" arrondiAuto="vrai" totalBoucles="5000000" nbDecimales="8"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#a" algoitem="a EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#b" algoitem="b EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#c" algoitem="c EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#saisr le nombre a#0" algoitem="AFFICHER &quot;saisr le nombre a&quot;"/>
        <item code="2#a#pasliste" algoitem="LIRE a"/>
        <item code="4#saisir le nombre b#0" algoitem="AFFICHER &quot;saisir le nombre b&quot;"/>
        <item code="2#b#pasliste" algoitem="LIRE b"/>
        <item code="4#saisir le nombre c#0" algoitem="AFFICHER &quot;saisir le nombre c&quot;"/>
        <item code="2#c#pasliste" algoitem="LIRE c"/>
        <item code="6#a&lt;b&lt;c" algoitem="SI (a&lt;b&lt;c) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="3#a#1#pasliste" algoitem="AFFICHER a"/>
            <item code="3#b#1#pasliste" algoitem="AFFICHER b"/>
            <item code="3#c#1#pasliste" algoitem="AFFICHER c"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
        </item>
        <item code="103#commentaire" algoitem=""/>
        <item code="6#a&lt;b>c" algoitem="SI (a&lt;b>c) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="3#a#0#pasliste" algoitem="AFFICHER a"/>
            <item code="3#c#0#pasliste" algoitem="AFFICHER c"/>
            <item code="3#b#1#pasliste" algoitem="AFFICHER b"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
        </item>
        <item code="6#a>b&lt;c  ET a&lt;c" algoitem="SI (a>b&lt;c  ET a&lt;c) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="3#b#1#pasliste" algoitem="AFFICHER b"/>
            <item code="3#a#1#pasliste" algoitem="AFFICHER a"/>
            <item code="3#c#1#pasliste" algoitem="AFFICHER c"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
        </item>
        <item code="6#a>b&lt;c ET a>c" algoitem="SI (a>b&lt;c ET a>c) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="3#b#1#pasliste" algoitem="AFFICHER b"/>
            <item code="3#c#1#pasliste" algoitem="AFFICHER c"/>
            <item code="3#a#1#pasliste" algoitem="AFFICHER a"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
        </item>
        <item code="6#a>b>c" algoitem="SI (a>b>c) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="3#c#1#pasliste" algoitem="AFFICHER c"/>
            <item code="3#b#1#pasliste" algoitem="AFFICHER b"/>
            <item code="3#a#1#pasliste" algoitem="AFFICHER a"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
        </item>
        <item code="6#a&lt;b>c" algoitem="SI (a&lt;b>c) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="3#c#1#pasliste" algoitem="AFFICHER c"/>
            <item code="3#a#1#pasliste" algoitem="AFFICHER a"/>
            <item code="3#b#1#pasliste" algoitem="AFFICHER b"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
        </item>
        <item code="103#commentaire" algoitem=""/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
