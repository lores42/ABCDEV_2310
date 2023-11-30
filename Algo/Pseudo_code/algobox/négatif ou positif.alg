<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="SI (n&lt;=-1) ALORS" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2etat="inactif" F2defaut="" F2para="" F2lignes=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param arrondiAuto="vrai" totalBoucles="5000000" maxBoucle="500000" nbDecimales="8" epaisseurLigne="2" epaisseurPoint="2" totalAffichages="1000"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="n EST_DU_TYPE NOMBRE" code="1#NOMBRE#n"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;saisir le nombre n : &quot;" code="4#saisir le nombre n : #0"/>
        <item algoitem="LIRE n" code="2#n#pasliste"/>
        <item algoitem="" code="103#commentaire"/>
        <item algoitem="SI (n >=1  ) ALORS" code="6#n >=1  ">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="AFFICHER &quot;le nombre est positif &quot;" code="4#le nombre est positif #0"/>
            <item algoitem="FIN_SI" code="8#finsi"/>
        </item>
        <item algoitem="SI (n&lt;=-1) ALORS" code="6#n&lt;=-1">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="AFFICHER &quot;le nombre est négatif &quot;" code="4#le nombre est négatif #0"/>
            <item algoitem="FIN_SI" code="8#finsi"/>
        </item>
        <item algoitem="" code="103#commentaire"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
