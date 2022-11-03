package dialogues;

public enum Dialogues {
	
	 DIALOGUES_SKELETON{
		@Override
		public String giveDialogue(int random) {
			return arrayOfDialoguesSkeleton[random];
		}
	  },
	 
	 DIALOGUES_ZOMBIE{
		@Override
		public String giveDialogue(int random) {
			return arrayOfDialoguesZombie[random];
		}
	  };
	
	
	public abstract String giveDialogue(int random);
	


	String[] arrayOfDialoguesSkeleton = {
			"Knock knock, who's there ?",
			"You shall not pass",
			"You're a dead man, Harry",
			"Stop with this bullshit of North and South ! Once and for all, the north, depending on how you are turned, changes everything!",
			"In spring I like to pee from the top of the ramparts at sunrise. There is a beautiful view",
			"Why didn't the skeleton go to the dance ? Because he had no body to dance with",
			"What's a skeleton favorite plant ? A bone-zai",
			"Bone-jour Mr adventurer",
			"I like to butter my toast",
			"The difference between you and me ? I'm da boss",
			"You have beautiful bones y'know ? Gimme them !"
			};
	
	
	String[] arrayOfDialoguesZombie = {
			"GruuUhaaaAAAOoiAuuU",
			"*fart*",
			"Eat bra...ins... You safe...",
			"Where Zomb'Hitler ? Need him",
			"Are yout the one who stole my tombestone ?",
			"Hope you did'nt eat coriander. 'Cause it gives horrible aftertaste to cadavers",
			"Tell me you've killed all the skeletons. Can't stand these bunches of bones",
			"Usually I only eat sexy women, but I'm too hungry to be picky",
			"No way I eat you, I'll get dumber",
			"Hey fatass, come here, have surprise for you",
			"Don't you bored ? It's at least the thousandth time you try to finish the dunjeon"
	};
	
}
