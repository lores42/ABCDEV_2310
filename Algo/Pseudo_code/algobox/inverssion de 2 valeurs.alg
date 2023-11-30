<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="AFFICHER &quot;valeur de B :&quot;" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2lignes="" F2para="" F2etat="inactif" F2defaut=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param nbDecimales="8" maxBoucle="500000" arrondiAuto="vrai" epaisseurLigne="2" totalBoucles="5000000" epaisseurPoint="2" totalAffichages="1000"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#nombre_a" algoitem="nombre_a EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#nombre_b" algoitem="nombre_b EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#nombre_c" algoitem="nombre_c EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#saisir la valeur A#0" algoitem="AFFICHER &quot;saisir la valeur A&quot;"/>
        <item code="2#nombre_a#pasliste" algoitem="LIRE nombre_a"/>
        <item code="4#saisir la valeur B#0" algoitem="AFFICHER &quot;saisir la valeur B&quot;"/>
        <item code="2#nombre_b#pasliste" algoitem="LIRE nombre_b"/>
        <item code="4#valeur de A :#0" algoitem="AFFICHER &quot;valeur de A :&quot;"/>
        <item code="3#nombre_a#1#pasliste" algoitem="AFFICHER nombre_a"/>
        <item code="4#valeur de B :#0" algoitem="AFFICHER &quot;valeur de B :&quot;"/>
        <item code="3#nombre_b#1#pasliste" algoitem="AFFICHER nombre_b"/>
        <item code="5#nombre_c#nombre_a#pasliste" algoitem="nombre_c PREND_LA_VALEUR nombre_a"/>
        <item code="5#nombre_a#nombre_b#pasliste" algoitem="nombre_a PREND_LA_VALEUR nombre_b"/>
        <item code="5#nombre_b#nombre_c#pasliste" algoitem="nombre_b PREND_LA_VALEUR nombre_c"/>
        <item code="4#nombre A est egale à : #0" algoitem="AFFICHER &quot;nombre A est egale à : &quot;"/>
        <item code="3#nombre_a#1#pasliste" algoitem="AFFICHER nombre_a"/>
        <item code="4#nombre B est egale à : #0" algoitem="AFFICHER &quot;nombre B est egale à : &quot;"/>
        <item code="3#nombre_b#1#pasliste" algoitem="AFFICHER nombre_b"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
