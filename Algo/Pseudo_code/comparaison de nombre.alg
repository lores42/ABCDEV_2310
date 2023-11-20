<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="SI (a>=0 et a&lt;=18) ALORS"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2etat="inactif" F2lignes="" F2para="" F2defaut=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param totalBoucles="5000000" maxBoucle="500000" epaisseurPoint="2" nbDecimales="8" totalAffichages="1000" arrondiAuto="vrai" epaisseurLigne="2"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="a EST_DU_TYPE NOMBRE" code="1#NOMBRE#a"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;Saisir votre age &quot;" code="4#Saisir votre age #0"/>
        <item algoitem="LIRE a" code="2#a#pasliste"/>
        <item algoitem="SI (a>17 ) ALORS" code="6#a>17 ">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="AFFICHER &quot;vous êtes majeur&quot;" code="4#vous êtes majeur#1"/>
            <item algoitem="FIN_SI" code="8#finsi"/>
        </item>
        <item algoitem="SI (a>=0 et a&lt;=18) ALORS" code="6#a>=0 et a&lt;=18">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="AFFICHER &quot;vous êtes mineur &quot;" code="4#vous êtes mineur #1"/>
            <item algoitem="FIN_SI" code="8#finsi"/>
        </item>
        <item algoitem="SI (a &lt;=-1) ALORS" code="6#a &lt;=-1">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="AFFICHER &quot;  vous n êtes pas née &quot;" code="4#  vous n êtes pas née #0"/>
            <item algoitem="FIN_SI" code="8#finsi"/>
        </item>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
