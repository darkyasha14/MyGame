package com.example.mygame;

import java.util.ArrayList;

public class DataList {
    private static String[]  gameName ={
            "DOTA 2",
            "Code Vain",
            "Devil May Cry 5",
            "League of Legends",
            "Destiny 2",
            "FARCRY",
            "GTA 5",
            "Hatred",
            "Jump Force",
            "WarCraft II",
            "Monster Hunter: World",
            "Ragnarok"
    };

    private static String[] rating = {
            "9.8","7.4","8.5",
            "9.0","8.0","8.9",
            "9.2","7.2","8.8",
            "8.7", "7.2","8.6"
    };

    private static int[] imgGame = {
            R.drawable.dota,
            R.drawable.codevein,
            R.drawable.devil,
            R.drawable.lol,
            R.drawable.destiny2,
            R.drawable.farcry,
            R.drawable.gta,
            R.drawable.hatred,
            R.drawable.jump,
            R.drawable.war,
            R.drawable.moster,
            R.drawable.ragnarok,
    };

    private  static String[] desc ={
            "Dota 2 is a multiplayer online battle arena (MOBA)" +
                    " video game developed and published by Valve Corporation. " +
                    "The game is a sequel to Defense of the Ancients (DotA), which " +
                    "was a community-created mod for Blizzard Entertainment's " +
                    "Warcraft III: Reign of Chaos and its expansion pack, The Frozen Throne. " +
                    "Dota 2 is played in matches between two teams of five players," +
                    " with each team occupying and defending their own separate base on the map",
            "Code Vein is an action role-playing video game developed by Bandai Namco Studios " +
                    "and the creators of the God Eater series, Shift, and published " +
                    "by Bandai Namco Entertainment. It was released in September 27th," +
                    " 2019 and was launched on the PS4, Xbox One, and PC (via Steam) " +
                    "platforms. The game is set in a post-apocatalypic dystopia with a" +
                    " vampire theme, featuring punishing gameplay inspired from FromSoftware's" +
                    " Souls series, and themes and designs reminiscent of Shift's previous" +
                    " works on the God Eater series.",
            "The game's story focuses on the player character Dante, a young man at the" +
                    " start of his saga. Dante is a Nephilim: half-angel, half-demon. He" +
                    " is partnered with his twin brother, Vergil, and is on a quest to " +
                    "kill the Demon King Mundus, who murdered their mother and condemned" +
                    " their father to banishment. Players can use Dante's iconic sword," +
                    " Rebellion, and signature handguns, Ebony and Ivory, as well as a " +
                    "variety of other melee weapons and firearms to defeat enemies. The" +
                    " game also introduces Angel Mode and Demon Mode, which are modifiers" +
                    " to Dante's moveset.",
            "In League of Legends, players assume the role of an unseen \"summoner\" " +
                    "that controls a \"champion\" with unique abilities and battle" +
                    " against a team of other players or computer-controlled champions." +
                    " The goal is usually to destroy the opposing team's \"Nexus\", " +
                    "a structure that lies at the heart of a base protected by " +
                    "defensive structures, although other distinct game modes " +
                    "exist as well. Each League of Legends match is discrete, " +
                    "with all champions starting off relatively weak but increasing" +
                    " in strength by accumulating items and experience over the " +
                    "course of the game.[2] The champions and setting blend a " +
                    "variety of elements, including high fantasy, steampunk, and " +
                    "Lovecraftian horror.",
            "Destiny 2 are divided among player versus environment (PvE) and player" +
                    " versus player (PvP) game types. In addition to normal story" +
                    " missions, PvE features three-player \"strikes\" and six-player" +
                    " raids. A free roam patrol mode is also available for each " +
                    "planet and features public events as well as new activities" +
                    " not featured in the original. These new activities have an" +
                    " emphasis on exploration of the planets and interactions " +
                    "with non-player characters (NPCs); the original Destiny " +
                    "only featured NPCs in social spaces.",
            "Set on a mysterious tropical archipelago, Far Cry follows ex-special" +
                    " forces soldier Jack Carver as he searches for a journalist" +
                    " he was escorting after she went missing when their boat was" +
                    " destroyed by mercenaries. The game is played from a first-person" +
                    " view and allows the player to use various weapons and tools as" +
                    " well as take advantage of their environments.",
            "The game is played from either a third-person or first-person perspective," +
                    " and its world is navigated on foot or by vehicle. Players control" +
                    " the three lead protagonists throughout single-player and switch" +
                    " between them both during and outside missions. The story is" +
                    " centred on the heist sequences, and many missions involve shooting" +
                    " and driving gameplay. A \"wanted\" system governs the aggression" +
                    " of law enforcement response to players who commit crimes." +
                    " Grand Theft Auto Online, the game's online multiplayer mode," +
                    " lets up to 30 players engage in a variety of different cooperative" +
                    " and competitive game modes.",
            "Hatred is a shooter video game presented in isometric perspective[1] in which" +
                    " the player-character is a mass-murdering villain who \"hates this world," +
                    " and the human worms feasting on its carcass\" and embarks on a \"genocide" +
                    " crusade\"[1] against the entire human race.[5] The player can carry three" +
                    " weapons and an assortment of grenades, as well as drive some vehicles." +
                    " Health is regenerated by performing summary executions on incapacitated" +
                    " people; the moves made to kill those victims involve cinematic switches" +
                    " of camera perspectives.",
            "Frieza attacks New York City with an army of Venoms, being confronted by Goku;" +
                    " however, a stray laser blast from Frieza fatally wounds a civilian" +
                    " caught in the war zone. Trunks revives the civilian with an advanced" +
                    " cybernetic device called an umbras cube, giving them potential to" +
                    " be a hero like them. Frieza withdraws, allowing Goku and Trunks to" +
                    " take the civilian back to their HQ, where they are greeted by Director" +
                    " Glover. Glover explains that the manga worlds from \"Jump\" have somehow" +
                    " begun merging with the real world and using their own umbras cubes to" +
                    " turn evil-hearted humans into Venoms, forcing him to create Jump Force" +
                    " to quell the threat; the organization consists of heroes from the \"Jump\"" +
                    " worlds, along with other people saved through the cubes.",
            "In Warcraft II, as in many real-time strategy (RTS) games, players collect" +
                    " resources to produce buildings and units in order to defeat an" +
                    " opponent in combat. Players gain access to more advanced units" +
                    " upon construction of tech buildings and research. The majority" +
                    " of the display screen shows the part of the territory on which" +
                    " the player is currently operating, and, using the small minimap," +
                    " the player can select another location to view and operate on." +
                    " The fog of war completely hides all territory which the player" +
                    " has not explored: terrain that has been explored is always" +
                    " visible, but enemy units remain visible only so long as they" +
                    " stay within a friendly unit's visual radius.",
            "Monster Hunter: World[a] is an action role-playing game developed and" +
                    " published by Capcom.  In the game, the player takes the role" +
                    " of a Hunter, tasked to hunt down and either kill or trap monsters" +
                    " that roam in one of several environmental spaces. If successful," +
                    " the player is rewarded through loot consisting of parts from the" +
                    " monster and other elements that are used to craft weapons and" +
                    " armor, amongst other equipment. The game's core loop has the" +
                    " player crafting appropriate gear to be able to hunt down more" +
                    " difficult monsters, which in turn provide parts that lead to" +
                    " more powerful gear. Players may hunt alone or in a group of up" +
                    " to four players via the game's online multiplayer.",
            "The country had become a shell of its former self, having been scarred" +
                    " by continuous war since ancient times. The Heart of Ymir," +
                    " which is said to be the source of mysterious power and Baphomet," +
                    " possessing the power of evil; what actually happened during" +
                    " the history of this mysterious country"


    };

    private static String[] developer={
            "Valve Corporation",
            "Bandai Namco Studios",
            "Capcom",
            "Riot Games",
            "Bungie",
            "Crytek",
            "Rockstar North",
            "Destructive Creations",
            "Spike Chunsoft",
            "Blizzard Entertainment",
            "Capcom",
            "Dream Square, Heartbeat Network",

    };

    static ArrayList<ModelList> getData() {
        ArrayList<ModelList> list = new ArrayList<>();
        for (int i = 0; i < gameName.length; i++){
            ModelList modelList = new ModelList();
            modelList.setTitle(gameName[i]);
            modelList.setRating(rating[i]);
            modelList.setImg(imgGame[i]);
            modelList.setDesc(desc[i]);
            modelList.setDev(developer[i]);
            list.add(modelList);
        }
        return list;

    }
    static ArrayList<ModelList> getData2() {
        ArrayList<ModelList> list = new ArrayList<>();
        for (int i = 0; i < (gameName.length-2); i++){
            ModelList modelList = new ModelList();
            modelList.setTitle(gameName[i]);
            modelList.setRating(rating[i]);
            modelList.setImg(imgGame[i]);
            modelList.setDesc(desc[i]);
            modelList.setDev(developer[i]);
            list.add(modelList);
        }
        return list;

    }

}
