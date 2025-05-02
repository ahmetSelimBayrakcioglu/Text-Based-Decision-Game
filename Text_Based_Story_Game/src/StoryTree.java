public class StoryTree {
    private StoryNode root;

    public StoryTree() {
        buildEpicStory();
    }

    private void buildEpicStory() {
        root = new StoryNode(
            "🌾 You lived peacefully with your spouse and children in a quiet village. One night, you woke up to screams.\n"
            + "1) Rush outside to see what’s happening\n"
            + "2) Run inside to check on your family", 
            2, 0
        );

        StoryNode outside = new StoryNode(
            "🔥 Outside, houses are burning. Masked men are kidnapping villagers.\n"
            + "1) Follow one of them\n"
            + "2) Go back inside", 
            2, 1
        );

        StoryNode inside = new StoryNode(
            "🏚️ Your spouse and children are gone... There are blood trails. Outside, you see an old woman crying.\n"
            + "1) Follow the trails\n"
            + "2) Ask the crying old woman", 
            2, 2
        );

        StoryNode followEnemy = new StoryNode(
            "🌲 You followed a caravan being dragged into the forest.\n"
            + "1) Get closer\n"
            + "2) Watch from a distance", 
            2, 3
        );

        StoryNode getCloser = new StoryNode(
            "💀 They spotted you and captured you, selling you to a slave trader.\n=== END: Slavery ===", 
            0, 46
        );
        getCloser.isEnding = true;

        StoryNode askOldWoman = new StoryNode(
            "👵 The old woman says the attackers went north.\n"
            + "1) Head out\n"
            + "2) Ask for more information", 
            2, 4
        );

        StoryNode enterForest = new StoryNode(
            "🌫️ The fog thickens on the road, reducing visibility. You hear strange sounds.\n"
            + "1) Keep going toward the sounds\n"
            + "2) Move in the opposite direction", 
            2, 5
        );

        StoryNode getLost = new StoryNode(
            "💥 You step into the void without realizing and fall off a cliff...\n=== END: Butterfly Effect ===",
            0, 51
        );
        getLost.isEnding = true;

        StoryNode leftForest = new StoryNode(
            "🌫️ You follow the path toward the sounds. Ahead, you see strange creatures.\n"
            + "1) Approach them and try to talk\n"
            + "2) Attack them by surprise", 
            2, 47
        );

        StoryNode tryTalk = new StoryNode(
            "🌫️ The creatures didn’t listen and attacked you directly.\n=== END: Savage Death ===",
            0, 48
        );
        tryTalk.isEnding = true;

        StoryNode deadCreatures = new StoryNode(
            "🌫️ You killed the creatures and found a portal in their lair.\n"
            + "1) Approach the portal\n"
            + "2) Head toward the village you see in the distance", 
            2, 49
        );

        StoryNode talkMore = new StoryNode(
            "👵 The woman shows a cult symbol. 'Follow the castle road,' she says.\n"
            + "1) Take the road to the castle\n"
            + "2) Head into the forest", 
            2, 6
        );

        StoryNode banditCamp = new StoryNode(
            "🏕️ You watch the camp from afar. You hear a woman screaming.\n"
            + "1) Launch an assault\n"
            + "2) Wait until night", 
            2, 7
        );

        StoryNode ambushFail = new StoryNode(
            "💥 It was a trap! You’ve been ambushed...\n=== END: Premature Death ===",
            0, 8
        );
        ambushFail.isEnding = true;

        StoryNode nightAssault = new StoryNode(
            "🌒 Night falls; you sneak inside. A young girl is a prisoner...\n"
            + "1) Rescue her\n"
            + "2) Check the other tents", 
            2, 9
        );

        StoryNode rescueDaughter = new StoryNode(
            "👧 You rescue her but she says, 'They took the prisoners to the castle.'\n"
            + "1) Head north\n"
            + "2) Search the camp", 
            2, 10
        );

        StoryNode exploreCamp = new StoryNode(
            "📜 You find a map of the village and a letter describing a secret passage into the castle.\n"
            + "1) Set out immediately\n"
            + "2) Stop by the marked village", 
            2, 11
        );

        StoryNode cursedVillage = new StoryNode(
            "👻 The village is abandoned... but a figure is watching you.\n"
            + "1) Approach it\n"
            + "2) Run away", 
            2, 12
        );

        StoryNode swamp = new StoryNode(
            "💩 While escaping, you get stuck in a swamp in the darkness and can’t get out.\n=== END: Swamp ===",
            0, 44
        );
        swamp.isEnding = true;

        StoryNode meetWitchCastle = new StoryNode(
            "🧙 On the way to the castle, a witch appears. 'I’ve read your mind,' she says.\n"
            + "1) Ask for help\n"
            + "2) Threaten her", 
            2, 42
        );

        StoryNode meetWitch = new StoryNode(
            "🧙 A witch appears. 'I’ve read your mind,' she says.\n"
            + "1) Ask for help\n"
            + "2) Threaten her", 
            2, 13
        );

        StoryNode witchCurse = new StoryNode(
            "🩸 The witch curses you... your mind grows foggy.\n=== END: Cursed Path ===",
            0, 14
        );
        witchCurse.isEnding = true;

        StoryNode witchAid = new StoryNode(
            "🕯️ 'There’s an enemy waiting for you on the castle road.'\n"
            + "1) Thank her and go\n"
            + "2) Ask for more information", 
            2, 15
        );

        StoryNode continueToCastle = new StoryNode(
            "🛤️ You proceed toward the secret passage described by the witch. A guard is waiting there.\n"
            + "1) Try to talk your way through\n"
            + "2) Fight to clear the path", 
            2, 16
        );

        StoryNode getMoreInfo = new StoryNode(
            "📜 The witch gives you an ancient scroll. 'This opens the castle’s secret door.'\n"
            + "1) Find the secret door\n"
            + "2) Go through the main gate", 
            2, 17
        );

        StoryNode guardTalk = new StoryNode(
            "🗣️ You tell the guard your family was taken. He shows you a secret passage.\n"
            + "1) Thank him and continue\n"
            + "2) Ask why he’s helping", 
            2, 18
        );

        StoryNode guardFight = new StoryNode(
            "⚔️ After a tough fight, you defeat the guard but are badly wounded.\n"
            + "1) Continue\n"
            + "2) Rest for a while", 
            2, 19
        );

        StoryNode guardHelpReveal = new StoryNode(
            "🔎 The guard was a cult member but regrets it. He offers you his sword and asks you to end his suffering.\n"
            + "1) Grant his wish and enter the castle silently\n"
            + "2) Console him and enter the castle silently", 
            2, 20
        );

        StoryNode secretDoor = new StoryNode(
            "🕳️ The secret passage is dark and narrow. You hear a scream.\n"
            + "1) Go toward the sound\n"
            + "2) Keep going", 
            2, 21
        );

        StoryNode withoutRest = new StoryNode(
            "🕸️ You continue to the main gate without resting. The soldiers easily kill you in your wounded state.\n=== END: The Importance of Rest ===", 
            0, 45
        );
        withoutRest.isEnding = true;

        StoryNode mainGateRest = new StoryNode(
            "🏰 You patch your wounds and enter through the main gate. The alarm sounds! Soldiers are chasing you.\n"
            + "1) Run\n"
            + "2) Fight", 
            2, 44
        );

        StoryNode mainGate = new StoryNode(
            "🏰 You enter through the main gate. The alarm sounds! Soldiers are chasing you.\n"
            + "1) Run\n"
            + "2) Fight", 
            2, 22
        );

        StoryNode caughtEnd = new StoryNode(
            "🩸 You can’t escape... They throw you into the dungeon.\n=== END: Chained Life ===", 
            0, 23
        );
        caughtEnd.isEnding = true;

        StoryNode fightInHall = new StoryNode(
            "🩷 You keep fighting hard. A figure is watching you from the castle: your spouse!\n"
            + "1) Run to them\n"
            + "2) Ignore them and keep fighting", 
            2, 24
        );

        StoryNode endOfFight = new StoryNode(
            "💀 As you continue fighting, the soldiers capture and execute you with your spouse.\n=== END: Orphaned Children ===", 
            0, 43
        );
        endOfFight.isEnding = true;

        StoryNode daughterCry = new StoryNode(
            "👧 You hear your daughter’s voice! But it might be an illusion.\n"
            + "1) Go toward the voice\n"
            + "2) Ignore it", 
            2, 25
        );

        StoryNode illusionTrap = new StoryNode(
            "🕸️ You fell into an illusion; your mind fades...\n=== END: Prison of the Mind ===", 
            0, 26
        );
        illusionTrap.isEnding = true;

        StoryNode passPortal = new StoryNode(
            "🕯️ At the end of the portal, you’re inside the castle. A cult ritual is happening.\n"
            + "1) Disrupt the ritual\n"
            + "2) Watch silently", 
            2, 50
        );

        StoryNode passDarkTunnel = new StoryNode(
            "🕯️ At the end of the passage, you’re inside the castle. A cult ritual is happening.\n"
            + "1) Disrupt the ritual\n"
            + "2) Watch silently", 
            2, 27
        );

        StoryNode disruptRitual = new StoryNode(
            "⛓️ The cult captures you but someone helps: it’s your spouse!\n"
            + "1) Escape with them\n"
            + "2) Fight the others", 
            2, 28
        );

        StoryNode joinRitual = new StoryNode(
            "🔥 They notice you watching and throw you into the eternal fire as a sacrifice...\n=== END: Eternal Torment ===", 
            0, 29
        );
        joinRitual.isEnding = true;

        StoryNode escapeWithWife = new StoryNode(
            "🏃 You escape with your spouse through the passage. Your children are waiting at the gate!\n=== END: Family Reunited ===", 
            0, 30
        );
        escapeWithWife.isEnding = true;

        StoryNode heroicFight = new StoryNode(
            "⚔️ You fight the entire cult... You win but suffer fatal wounds.\n=== END: Heroic Sacrifice ===", 
            0, 31
        );
        heroicFight.isEnding = true;

        StoryNode escapeWithChildren = new StoryNode(
            "👶 Your children run to hug you! But the castle is collapsing.\n"
            + "1) Run away quickly\n"
            + "2) Leave the kids and escape with your spouse", 
            2, 32
        );

        StoryNode stayForRescue = new StoryNode(
            "💔 'Don’t leave us!' your children plead. But you must flee the castle.\n"
            + "1) Take them and run\n"
            + "2) Take your spouse and leave the kids", 
            2, 33
        );

        StoryNode familyEnd = new StoryNode(
            "🚪 You manage to escape with your family as the castle collapses. You find eternal peace together.\n=== END: Together Forever ===", 
            0, 34
        );
        familyEnd.isEnding = true;

        StoryNode sacrificeEnd = new StoryNode(
            "💔 You had to leave the children behind. You escape with your spouse, but end up alone.\n=== END: Lonely Hero ===", 
            0, 35
        );
        sacrificeEnd.isEnding = true;

        StoryNode finalBossBattle = new StoryNode(
            "🖤 One last battle in the castle. Your spouse, children, and even the cult are watching.\n"
            + "1) Face the cult leader\n"
            + "2) Join the cult and build a new order", 
            2, 36
        );

        StoryNode bossFight = new StoryNode(
            "⚔️ You defeated the cult leader, but a greater power awaits... Who was the true leader?\n"
            + "1) Ask who the real leader is\n"
            + "2) Take revenge", 
            2, 37
        );

        StoryNode revengeEnd = new StoryNode(
            "💀 You took your revenge, but your family forgot you as they fled the castle.\n=== END: Lost Family ===", 
            0, 38
        );
        revengeEnd.isEnding = true;

        StoryNode truthEnd = new StoryNode(
            "🗣️ The real leader was your old friend... But it was too late.\n=== END: Lost Friend ===", 
            0, 39
        );
        truthEnd.isEnding = true;

        StoryNode newOrderEnd = new StoryNode(
            "🖤 You now control the cult and establish a new order. But your family has left you.\n=== END: Dark Order ===", 
            0, 40
        );
        newOrderEnd.isEnding = true;

        StoryNode heroismEnd = new StoryNode(
            "💖 You achieved true heroism! You and your family build a peaceful life together.\n=== END: True Hero ===", 
            0, 41
        );
        heroismEnd.isEnding = true;



        // Bağlantılar// Giriş Seçenekleri
        root.addChoice(0, outside);
        root.addChoice(1, inside);

        outside.addChoice(0, followEnemy);
        outside.addChoice(1, inside);

        inside.addChoice(0, followEnemy);
        inside.addChoice(1, askOldWoman);

        askOldWoman.addChoice(0, enterForest);
        askOldWoman.addChoice(1, talkMore);

        talkMore.addChoice(0, meetWitchCastle);
        talkMore.addChoice(1, enterForest);

        enterForest.addChoice(0, leftForest);
        enterForest.addChoice(1, getLost);

        leftForest.addChoice(0, tryTalk);
        leftForest.addChoice(1, deadCreatures);

        deadCreatures.addChoice(0, passPortal);
        deadCreatures.addChoice(1, cursedVillage);

        passPortal.addChoice(0, disruptRitual);
        passPortal.addChoice(1, joinRitual);

        meetWitchCastle.addChoice(0, witchAid);
        meetWitchCastle.addChoice(1, witchCurse);

        followEnemy.addChoice(0, getCloser);
        followEnemy.addChoice(1, banditCamp);

        banditCamp.addChoice(0, ambushFail);
        banditCamp.addChoice(1, nightAssault);

        nightAssault.addChoice(0, rescueDaughter);
        nightAssault.addChoice(1, exploreCamp);

        rescueDaughter.addChoice(0, mainGate);
        rescueDaughter.addChoice(1, exploreCamp);

        exploreCamp.addChoice(0, secretDoor);
        exploreCamp.addChoice(1, cursedVillage);

        cursedVillage.addChoice(0, meetWitch);
        cursedVillage.addChoice(1, swamp);

        meetWitch.addChoice(0, witchAid);
        meetWitch.addChoice(1, witchCurse);

        witchAid.addChoice(0, continueToCastle);
        witchAid.addChoice(1, getMoreInfo);

        getMoreInfo.addChoice(0, secretDoor);
        getMoreInfo.addChoice(1, mainGate);


        continueToCastle.addChoice(0, guardTalk);
        continueToCastle.addChoice(1, guardFight);

        guardTalk.addChoice(0, secretDoor);
        guardTalk.addChoice(1, guardHelpReveal);

        guardHelpReveal.addChoice(0, secretDoor);
        guardHelpReveal.addChoice(1, secretDoor);

        guardFight.addChoice(0, withoutRest);
        guardFight.addChoice(1, mainGateRest);

        secretDoor.addChoice(0, daughterCry);
        secretDoor.addChoice(1, passDarkTunnel);

        daughterCry.addChoice(0, illusionTrap);
        daughterCry.addChoice(1, passDarkTunnel);

        passDarkTunnel.addChoice(0, disruptRitual);
        passDarkTunnel.addChoice(1, joinRitual);

        disruptRitual.addChoice(0, escapeWithWife);
        disruptRitual.addChoice(1, heroicFight);

        escapeWithWife.addChoice(0, familyEnd);
        escapeWithWife.addChoice(1, sacrificeEnd);

        mainGate.addChoice(0, caughtEnd);
        mainGate.addChoice(1, fightInHall);

        mainGateRest.addChoice(0, caughtEnd);
        mainGate.addChoice(1, fightInHall);

        fightInHall.addChoice(0, escapeWithWife);
        fightInHall.addChoice(1, endOfFight);

        finalBossBattle.addChoice(0, bossFight);
        finalBossBattle.addChoice(1, newOrderEnd);

        bossFight.addChoice(0, truthEnd);
        bossFight.addChoice(1, revengeEnd);

        escapeWithChildren.addChoice(0, familyEnd);
        escapeWithChildren.addChoice(1, sacrificeEnd);

        stayForRescue.addChoice(0, familyEnd);
        stayForRescue.addChoice(1, sacrificeEnd);

    }


    public StoryNode getRoot() {
        return root;
    }
}
