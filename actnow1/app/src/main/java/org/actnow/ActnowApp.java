package org.actnow;

import android.content.Context;

import java.util.ArrayList;
import java.util.Calendar;

public class ActnowApp {

    private static Context context;
    private static boolean authenticated;
    public static boolean aboutViewed;

    public static ArrayList<Story> getCannedStories() {
        ArrayList<Story> cannedStories = new ArrayList<Story>();

        Story story1 = new Story();
        story1.setAuthor("Anas Aremeyaw");
        story1.setDate(Calendar.getInstance().getTime());
        story1.setTitle("Spirit Child");
        story1.setSummary("An investigation into the ritual killing of disabled Ghanaian children deemed to be possessed by evil spirits.");
        story1.setStory(context.getResources().getString(
                R.string.spirit_child_story));
        story1.setSignatures("404");
        story1.setImage(context.getResources().getDrawable(
                R.drawable.spirit_child));
        cannedStories.add(story1);

        Story story2 = new Story();
        story2.setAuthor("Anas Aremeyaw");
        story2.setDate(Calendar.getInstance().getTime());
        story2.setTitle("Ghana’s Madhouse Story");
        story2.setSummary("Anas went undercover for seven months — as a baker, taxi driver and finally a mental patient — in and around Accra Psychiatric Hospital.");
        story2.setStory(context.getResources().getString(
                R.string.spirit_child_story));
        story2.setImage(context.getResources().getDrawable(
                R.drawable.spell_of_the_albino));
        story2.setSignatures("44");
        cannedStories.add(story2);

        Story story3 = new Story();
        story3.setAuthor("Anas Aremeyaw");
        story3.setDate(Calendar.getInstance().getTime());
        story3.setTitle("Spell of the Albino");
        story3.setSummary("Anas investigates atrocities faced by albinos in Tanzania.");
        story3.setStory(context.getResources().getString(
                R.string.spell_of_albino_story));
        story3.setImage(context.getResources().getDrawable(
                R.drawable.spell_of_the_albino));
        story3.setSignatures("40");
        cannedStories.add(story3);

        Story story4 = new Story();
        story4.setAuthor("Anas Aremeyaw");
        story4.setDate(Calendar.getInstance().getTime());
        story4.setTitle("The Messiah of Mentukwa'");
        story4.setSummary("...When Children Are Beaten, Denied School, Forced Into Marriage In The Name of Jesus Christ As Preparation for the End Time. I Went Undercover In The End Day Temple, Mentukwa as Joseph Christ. Where There is Defilement In The Church In The Name Of Prophecy");
        story4.setStory(context.getResources().getString(
                R.string.spirit_child_story));
        story4.setSignatures("13");
        story4.setImage(context.getResources().getDrawable(R.drawable.anas_1));
        cannedStories.add(story4);

        Story story5 = new Story();
        story5.setAuthor("Anas Aremeyaw");
        story5.setDate(Calendar.getInstance().getTime());
        story5.setTitle("Ghana: Journalist goes undercover to expose traffickers");
        story5.setSummary("Police in Ghana storm a camp being used to keep children in slavery after one journalist spent weeks infiltrating the traffickers. In this video, CNN correspondent Vlad Duthiers meets the journalist and asks the minister responsible for protecting children what the government is doing to help.");
        story5.setStory(context.getResources().getString(
                R.string.spirit_child_story));
        story5.setSignatures("1024");
        story5.setImage(context.getResources().getDrawable(
                R.drawable.anas_walking));
        cannedStories.add(story5);

        return cannedStories;
    }

    public static void setContext(Context context) {
        ActnowApp.context = context;
    }

    public static Context getContext() {
        return ActnowApp.context;
    }

    public static void setAuthenticated(boolean authenticated) {
        ActnowApp.authenticated = authenticated;
    }

    public static String getChineseMafiaStory() {
        return "The boss of Peach Blossom Palace is spotted in Ghana’s most expensive casino, wearing Gucci shades, a golden brown Emperio Amani tuxedo and a custom-made Rolex wrist watch.\n" +
                "\n" +
                "Scores of raunchy mini-skirted Chinese girls fill up his glass with exotic French champagne. He spins his cozy swivel chair in sensuous delirium as the ladies’ dainty fingers caress his neck, back and shoulders to orthopedic effect. “Ha,ha ha!” he lets out another loud peal of frenzied laughter.\n" +
                "\n" +
                "There is no doubt that this imposing figure is a successful man. No doubt at all that his prosperity comes from hot sweat. What is not immediately evident though is the fact that the sweat that rakes in his millions does not flow from his own pores but from the disreputable chores of hapless naïve lasses he had made whores on the shores of West Africa; the fact that he presides over an evil empire that traffics his own Chinese compatriots, engaging them in sex slavery, not only here in Ghana, but also in Nigeria and Togo.\n" +
                "\n" +
                "There is no doubt that this impressive figure is a successful man. His appearance likewise leaves little doubt that his prosperity comes from brisk business. What is not immediately evident is the fact that he rakes in millions that flow not from his own pores, but from the bloody chores of hapless, naïve lasses he has made whores on the shores of West Africa. He presides over an evil empire, which traffics his Chinese compatriots, engaging them in sex slavery, not only here in Ghana, but also in Nigeria and Togo.\n" +
                "\n" +
                "The non-African expatriate community is the clientele. Peach Blossom Palace is the wholesale outlet from where the “goods” are marketed and sold. Poor, innocent and vulnerable Chinese girls, some as young as 19, are the human commodity on sale paraded in front of the clients like pieces of meat in a butcher shop window. They are lured here with promises of honest, well-paid jobs, only to have their passports and return tickets confiscated. The travel documents may be recovered, but only after one had paid off the cost – invariably inflated - of the trip to Accra. They are beaten and threatened with a high debt to be repaid only through the sale of their bodies. They are thrown into debt bondage and forced to sell their innocence and human dignity for their master’s gain in nightclubs and casinos. ‘I was told that I was going to be waitressing in a Chinese restaurant, but it however turned into nightmare. There was no way of turning back and I resorted to this dehumanizing business’ said one of the girls. Any of this trafficker’s victims, who attempt anything akin to disobedience, not to talk of rebellion, is firmly, swiftly and brutally repressed.\n" +
                "\n" +
                "Six months of backbreaking investigation yielded the above discovery on the nefarious activities of King James, the man at the centre of the sex trafficking ring.\n" +
                "\n" +
                "Posing as a bartender in the hotels where this sordid business is carried out, “The New Crusading Guide” reporter managed to capture every aspect of this trade with a hidden camera. He also pretended to befriend a lady who lived in the brothel and from whom, over a period of four months, he obtained valuable, first-hand accounts of the activities of King James and his colleagues. All of the above described is captured on video. It was upon the presentation of this evidence that the Police CID planned and carried out a raid on the Peach Blossom Palace in Labadi,Accra.\n" +
                "\n" +
                "The United Nations Convention Against Transnational Organized Crime, Supplemental Protocol to Prevent, Suppress and Punish Trafficking in Persons, Especially Women and Children (2000) serves as the international legal standard. It outlines the definition of human trafficking in Article 3 (a):\n" +
                "\n" +
                "“Trafficking in persons” shall mean the recruitment, transportation, transfer, harbouring or receipt of persons, by means of the threat or use of force or other forms of coercion, of abduction, of fraud, of deception, of the abuse of power or of a position of vulnerability or of the giving or receiving of payments or benefits to achieve the consent of a person having control over another person, for the purpose of exploitation. Exploitation shall include, at a minimum, the exploitation of the prostitution of others or other forms of sexual exploitation, forced labour or services, slavery or practices similar to slavery, servitude or the removal of organs.”\n" +
                "\n" +
                "Human trafficking is the fastest growing criminal industry in the world, with total annual revenue for trafficking in persons estimated to be between $5 billion and $9 billion. The Council of Europe states that “people trafficking has reached epidemic proportions over the past decade, with a global annual market of about $42.5 billion”\n" +
                "\n" +
                "Enslavement Prevention Alliance – West Africa, an NGO that has provided the victims with post-rescue care, stated that: “The ruthless criminals behind the sexual exploitation of these vulnerable women should feel the full hand of the Ghanaian law. This would not only serve to provide the victims with justice, it would also serve as a deterrent to all those who wish to perpetrate similar crimes in Ghana. Swift prosecution of this case will send a clear message that the business of sexual slavery is not welcome here.”\n" +
                "\n" +
                "HOW THE COMPLEX WEB OPERATES\n" +
                "The mafia operates from Ghana (main distributor) to Lome, Togo and Ikoye, Victoria Islands area in Lagos, Nigeria where the girls rotate. The New Crusading GUIDE has also picked up signals of the Chinese sex mafia’s strong presence in Nairobi, Kenya. “When Chinese girls are used in America they are sent down to some of these African countries for further exploitation”. Our source hinted. In Ghana, Tema, the harbour city serves as a hub for brisk business as some expatriate staff are able to hire the girls for over three months paying $200 per night. The girls with dreams of a better life, away from the grinding poverty are sometimes seen hovering around the French Embassy areas in Nigeria where pubs are located.\n" +
                "\n" +
                "In all these countries, the modus operandi of beating the girls whenever they refuse to serve a client is prevalent.\n" +
                "\n" +
                "Just like the locations in Accra, the Chinese sex trafficking mafia do not deal with gleaming villas’, they choose locations where people least expect them to be, to carry out their activities. The girls usually wear short skirts and look very flirty. ‘The area in La, (Ghana) where the ring operates from, has some trappings of a shanty town, it is very difficult for one to even assume that this kind of thing can happen there’ said Kester Aburam Korankye of the Cobra Eye Investigative Team.\n" +
                "\n" +
                "In all these countries, the young and pretty attract more cash, our inside source who does not want to be named indicated to us in an interview. “If they are between the ages of 19 and 22, their price can be higher than $ 200 per night. Virgins can fetch over 1000 dollars, as for traffickers they go where the money is, they don’t care whether its Africa or Mongolia, the cash is most significant” our source concluded.\n" +
                "\n" +
                "THE HARD CORE EVIDENCE, REPORTER POSING AS A BARTENDER MONITORING ACTIVITIES OF THE TRAFFICKER AND THE GIRLS\n" +
                "\n" +
                "The undercover footage begins with a scene of an expatriate sitting on a luxurious bed in a plush hotel room with trafficker. On the same bed lies a half-naked Chinese girl, playfully running her left forefinger through her hair.\n" +
                "\n" +
                "Exactly 45 seconds into the footage, the expatriate and the trafficker start a conversation on the processes involved in bringing Chinese girls to Africa. Footage of the expatriate is seen handing over 150 US dollars to trafficker as payment for the Chinese girl he brought for that evening’s pleasure. The footage continues with the reporter walking into the hotel room dressed as a bartender (wearing a black tie on a white long- sleeved shirt tucked into black trousers) with a bottle of beer on a serving tray in hand. He walks to the two men carrying the beer. At exactly 5 minutes 17 seconds into the footage, a conversation commences between the expatriate and the trafficker, which states the following:\n" +
                "\n" +
                "Expatriate: How much will you pay for a girl to come here? $6,000?\n" +
                "\n" +
                "Trafficker: Not $6,000 maybe less $1,000. You pay ticket, visa everything.\n" +
                "\n" +
                "Expatriate: Ticket, visa everything?\n" +
                "\n" +
                "Trafficker: Do you know something? After we brought one girl here, she went to the Chinese Embassy and complained that we beat her, but we didn’t mind her and I only gave her a ticket to go back to China (blah, blah, blah).\n" +
                "\n" +
                "Expatriate: So you know some agents, you know some agents?\n" +
                "\n" +
                "Trafficker: I know but long time\n" +
                "\n" +
                "Expatriate: But you will try\n" +
                "\n" +
                "Trafficker: Yes, I will try, I recall\n" +
                "\n" +
                "Expatriate: How much will we pay for the agents?\n" +
                "\n" +
                "Trafficker: If you know the agent, we can talk, better girl we must pay more money. Like the age is 30 years old then small money, but 22 or 23 then more money. Like $1,500\n" +
                "\n" +
                "Expatriate: Not too much, not too much, what of 17 years? Seventeen years old not fine?\n" +
                "\n" +
                "Trafficker: Ah not big, too young. We can bring 20 years. China will not allow you to bring young lady come here. They will check your passport and ask you this and ask you that.\n" +
                "\n" +
                "ENTERS THE REPORTER DISGUISED AS A BARTENDER\n" +
                "\n" +
                "Reporter: Can I please serve you the drink?\n" +
                "\n" +
                "Expatriate: Would you hurry up and get lost from this room!\n" +
                "\n" +
                "Reporter: I’m sorry sir, I was only….\n" +
                "\n" +
                "Expatriate: Just hurry up and leave here\n" +
                "\n" +
                "Reporter: Yes sir.\n" +
                "\n" +
                "The expatriate shouts at the reporter to leave the room, having noticed him stealing glances at the Chinese girl who lies half-naked on the other side of the bed. “Get out of this room now!”\n" +
                "\n" +
                "THE TRUMP OF DOOM, REPORTER AND THE BEFRIENDED GIRL WHO SPILLED THE BEANS\n" +
                "\n" +
                "Footage begins with the reporter descending a staircase hand-in-hand with a girl. People sitting at bar tables in a dimly lit restaurant by the ocean drinking to the blast of loud music are shown for a while. This is followed by footage of the reporter ushering the girl into a seat close to the sea. At exactly 1 minute 25 seconds of footage, a conversation begins as follows:\n" +
                "\n" +
                "REPORTER: So how are you?\n" +
                "\n" +
                "GIRL: Fine, my people are coming tomorrow\n" +
                "\n" +
                "REPORTER: You’re what?\n" +
                "\n" +
                "GIRL: My people will come tomorrow\n" +
                "\n" +
                "REPORTER: Yeah, yeah your people and your husband too. Where is your husband?\n" +
                "\n" +
                "GIRL: He will be coming tomorrow\n" +
                "\n" +
                "REPORTER: So this Chinese people, what do you cook for them?\n" +
                "\n" +
                "GIRL: That boy, its all about local food. He eats rice, stew and chicken.\n" +
                "\n" +
                "REPORTER; I see, so the girls, which part of china do they come from?\n" +
                "\n" +
                "GIRL: That one “dea” I can’t tell oo. They are from different state. Some are even from the villages, so they know how to farm and everything. I am here and I can’t even hold a cutlass to dig a hole. As for them, they know everything about the farm.\n" +
                "\n" +
                "REPORTER; But they are beautiful eeh!\n" +
                "\n" +
                "GIRL: Yes, somehow.\n" +
                "\n" +
                "REPORTER: So all they do is casino, casino eeh!\n" +
                "\n" +
                "GIRL: They used to play it in the house\n" +
                "\n" +
                "REPORTER: They used to play casino in the house?\n" +
                "\n" +
                "GIRL: Yes they play it with money, when they are playing, they write something, so you can not read it.\n" +
                "\n" +
                "REPORTER; Yeah! So do they really get sick?\n" +
                "\n" +
                "GIRL: Yes\n" +
                "\n" +
                "REPORTER; Aahhh!!\n" +
                "\n" +
                "GIRL: Yes, if they feel any pains in their stomach or any part of their body, they will have to go to the hospital, for they are not like we, black men who stay in the house for long before visiting the hospital when we are sick.\n" +
                "\n" +
                "REPORTER; So it’s their boss who must pay.\n" +
                "\n" +
                "GIRL; Yes, there are times they not only casino, they at times prostitution, so they know what they do, sometimes the men come to the house.\n" +
                "\n" +
                "REPORTER; Aahhh, so they know what they do.\n" +
                "\n" +
                "GIRL: Yes, sometimes the men come to the house.\n" +
                "\n" +
                "REPORTER: So when the men do it, then the men will pay.\n" +
                "\n" +
                "GIRL: Yes; GHc 1.7million, (old Ghana cedis) for one night!\n" +
                "\n" +
                "REPORTER: GHc 1.7million(old Ghana cedis)?\n" +
                "\n" +
                "GIRL; Yes GHc 1.7 for one night oooh!! So just imagine 12 months, they are making money.\n" +
                "\n" +
                "REPORTER; Aahhh, so when she takes the GHc1.7, that money must go to the boss, right!!\n" +
                "\n" +
                "GIRL: Yes\n" +
                "\n" +
                "REPORTER; Then, how much the boss will give them.\n" +
                "\n" +
                "GIRL; The boss will give them money, as for the amount I don’t know.\n" +
                "\n" +
                "REPORTER; Aahhh!!\n" +
                "\n" +
                "GIRL: Eeh, at first, they gave it to them at the restaurant. But when I move to the house, I don’t see anything like that. I see the men come to the house, taking the ladies and making love with them. And I keep wondering and saying “what kind of business is this”? So one day, the boss called me and said Mary, “I am sorry, you see the business.” Then I asked “what business? Then he said, “As for the girls, they are all prostitutes, you see the men come to them! There are times they use to sleep with them in the house and sometimes take them out of the house. You pay hotel bill.\n" +
                "\n" +
                "REPORTER; Aahhh\n" +
                "\n" +
                "GIRL; Yes, it just like a hotel, you pay GHc20. So you spend roughly\n" +
                "\n" +
                "GHc 200, when you sleep with them in the house. You bath and even eat. We give them food.\n" +
                "\n" +
                "REPORTER: The job is not a good job eeh?\n" +
                "\n" +
                "GIRL ; The job is not a good job at all eeh. Sometimes they will ask me, “What have you been doing at all?” and I will tell them, “Leave me alone, is it your business?” It is a restaurant and it is not open to only Chinese people but with everything going on, everybody suspect it. They can play music and shout.\n" +
                "\n" +
                "REPORTER; Aahhh\n" +
                "\n" +
                "GIRL ; The music is very high, so even when you are out you hear the music. My first time I hear the music, I went there to see before I work there.\n" +
                "\n" +
                "REPORTER; So have you really seen a naked, eeh, me I have never seen a naked Chinese woman before ooo!!\n" +
                "\n" +
                "GIRL ; Oohhh, I, yes, yes, because I am a woman.\n" +
                "\n" +
                "REPORTER; So you’ve seen them naked before?\n" +
                "\n" +
                "GIRL: Eeh, oooh\n" +
                "\n" +
                "REPORTER; With a man?\n" +
                "\n" +
                "GIRL: No. no, with a man no, they also have their special rooms.\n" +
                "\n" +
                "REPORTER: The Chinese girls also have their special rooms? So how are their rooms arranged?\n" +
                "\n" +
                "GIRL: They are just like students, two on one bed. Because it is two, one oom contain six beds. There are two rooms. Only two rooms\n" +
                "\n" +
                "THE DRAMATIC VALANTINE’S DAY RAID OF KING JAMES' PALACE\n" +
                "\n" +
                "At exactly 8:oo am on Valentine’s Day 2009, a combined force of over eighty armed men from the Panther Unit of the Ghana Police Service and Criminal Investigative Department (CID) besieged the premises of the Peach Blossom Palace in Labadi, near La Palm Royal Beach Hotel, Accra to conduct a swift “surgical” operation.\n" +
                "\n" +
                "In what can be described as a typical scene from a Hollywood thriller, policemen surrounded the brothel, as some of the men weighed down on the premises to round up and rescue the victims of human trafficking. Hundreds of onlookers filled-up the streets to catch a glimpse of the raid.\n" +
                "\n" +
                "In all, seven (7) Chinese girls and a Ghanaian couple, identified as house helpers of King James, were rescued by the police. King James, who was sitting bare-chested with his wife next to him in the house, was immediately arrested by armed policemen.\n" +
                "\n" +
                "Peach Blossom Palace, which from the exterior appears to be a bar, held several rooms which served as brothels for the Chinese girls. During a thorough search of the house, the police found bags filled with condoms, needles and syringes, medicines, artificial vibrator penis, wooden penis, passports, exotic pornographic movies, microphones for singing and lap dancing equipment.\n" +
                "\n" +
                "The police also retrieved 14,000 US Dollars in cash and some unspecified amount of money in Chinese Yuan and Ghana Cedis from King James. According to an insider, the money was part of fees paid for the sexual exploitation of the victims in the previous week.\n" +
                "\n" +
                "After putting the rescued girls on board a waiting bus, several armed policemen escorted King James and two other Chinese men (believed to be accomplices) to the waiting vehicle.\n" +
                "\n" +
                "Coming soon is the interesting details of phone calls which came through to the Chinese girls which said \"we will cut your throat if you talk to anybody\".</string>\n";
    }

    public static boolean isAuthenticated() {
        return authenticated;
    }
}
