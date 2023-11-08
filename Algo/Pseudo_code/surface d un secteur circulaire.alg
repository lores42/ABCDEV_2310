<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="AFFICHERCALCUL 4*Math.PI*pow(rayonR,2)" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctcode="4*Math.PI*rayonR^2" fctetat="actif"/>
    <F2 F2para="" F2lignes="" F2defaut="" F2etat="inactif"/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param nbDecimales="8" totalAffichages="1000" totalBoucles="5000000" epaisseurLigne="2" epaisseurPoint="2" arrondiAuto="vrai" maxBoucle="500000"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="rayonR EST_DU_TYPE NOMBRE" code="1#NOMBRE#rayonR"/>
        <item algoitem="airSphere EST_DU_TYPE NOMBRE" code="1#NOMBRE#airSphere"/>
        <item algoitem="volumeSphere EST_DU_TYPE NOMBRE" code="1#NOMBRE#volumeSphere"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;saisir le rayon R&quot;" code="4#saisir le rayon R#0"/>
        <item algoitem="LIRE rayonR" code="2#rayonR#pasliste"/>
        <item algoitem="AFFICHER &quot;l'air de la sphere est de  : &quot;" code="4#l'air de la sphere est de  : #0"/>
        <item algoitem="AFFICHERCALCUL 4*Math.PI*pow(rayonR,2)" code="20#4*Math.PI*pow(rayonR,2)#1"/>
        <item algoitem="AFFICHER &quot;le volume de la sphere est de : &quot;" code="4#le volume de la sphere est de : #0"/>
        <item algoitem="AFFICHERCALCUL (4/3)*Math.PI*pow(rayonR,3)" code="20#(4/3)*Math.PI*pow(rayonR,3)#0"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
