<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="AFFICHER &quot;saisir le nombre d années&quot;" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2para="" F2lignes="" F2etat="inactif" F2defaut=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param maxBoucle="500000" epaisseurLigne="2" totalBoucles="5000000" epaisseurPoint="2" totalAffichages="1000" nbDecimales="8" arrondiAuto="vrai"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="somme_S EST_DU_TYPE NOMBRE" code="1#NOMBRE#somme_S"/>
        <item algoitem="nombre_N EST_DU_TYPE NOMBRE" code="1#NOMBRE#nombre_N"/>
        <item algoitem="interet_i EST_DU_TYPE NOMBRE" code="1#NOMBRE#interet_i"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;saisir la somme S&quot;" code="4#saisir la somme S#0"/>
        <item algoitem="LIRE somme_S" code="2#somme_S#pasliste"/>
        <item algoitem="AFFICHER &quot;saisir le nombre d années&quot;" code="4#saisir le nombre d années#0"/>
        <item algoitem="LIRE nombre_N" code="2#nombre_N#pasliste"/>
        <item algoitem="AFFICHER &quot;saisir intérêt  I&quot;" code="4#saisir intérêt  I#0"/>
        <item algoitem="LIRE interet_i" code="2#interet_i#pasliste"/>
        <item algoitem="AFFICHER &quot;L'intérêt simple est de : &quot;" code="4#L'intérêt simple est de : #0"/>
        <item algoitem="AFFICHERCALCUL somme_S*(1+nombre_N*(interet_i/100))" code="20#somme_S*(1+nombre_N*(interet_i/100))#1"/>
        <item algoitem="AFFICHER &quot;L'intérêt composé est de : &quot;" code="4#L'intérêt composé est de : #0"/>
        <item algoitem="AFFICHERCALCUL somme_S*pow((1+(interet_i/100)),nombre_N)" code="20#somme_S*pow((1+(interet_i/100)),nombre_N)#0"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
