<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="LIRE nombre_a" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2para="" F2lignes="" F2etat="inactif" F2defaut=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param maxBoucle="500000" epaisseurLigne="2" totalBoucles="5000000" epaisseurPoint="2" totalAffichages="1000" nbDecimales="8" arrondiAuto="vrai"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="nombre_a EST_DU_TYPE NOMBRE" code="1#NOMBRE#nombre_a"/>
        <item algoitem="nombre_b EST_DU_TYPE NOMBRE" code="1#NOMBRE#nombre_b"/>
        <item algoitem="nombre_c EST_DU_TYPE NOMBRE" code="1#NOMBRE#nombre_c"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;saisir la valeur A&quot;" code="4#saisir la valeur A#0"/>
        <item algoitem="LIRE nombre_a" code="2#nombre_a#pasliste"/>
        <item algoitem="AFFICHER &quot;saisir la valeur B&quot;" code="4#saisir la valeur B#0"/>
        <item algoitem="LIRE nombre_b" code="2#nombre_b#pasliste"/>
        <item algoitem="AFFICHER &quot;la valeur A est : &quot;" code="4#la valeur A est : #0"/>
        <item algoitem="AFFICHER nombre_a" code="3#nombre_a#1#pasliste"/>
        <item algoitem="AFFICHER &quot;la valeur B est : &quot;" code="4#la valeur B est : #0"/>
        <item algoitem="AFFICHER nombre_b" code="3#nombre_b#1#pasliste"/>
        <item algoitem="AFFICHER &quot;la valeur de: A devient: B &quot;" code="4#la valeur de: A devient: B #1"/>
        <item algoitem="AFFICHER &quot;A est égale à : &quot;" code="4#A est égale à : #0"/>
        <item algoitem="LIRE nombre_b" code="2#nombre_b#pasliste"/>
        <item algoitem="AFFICHER &quot;la valeur de: B devient: A&quot;" code="4#la valeur de: B devient: A#1"/>
        <item algoitem="AFFICHER &quot;B est égale à : &quot;" code="4#B est égale à : #0"/>
        <item algoitem="LIRE nombre_a" code="2#nombre_a#pasliste"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
