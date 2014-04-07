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

    //loading these string as a resource is slow
    //trying this option for now
    //TODO fix performance issue
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

    public static String getJournalistFaceToFaceStory() {
        return "<![CDATA[Clash Of The Titans, Investigative Journalist Face-to-Face with Chinese Sex Mafia ‘Dons’.\n" +
                "\n" +
                "<b>HARDCORE DOSSEIR IN COURT</b>\n" +
                "\n" +
                "Not even theatre goers could have had a better deal than the drama that unfolded last Tuesday in an Accra Circuit Court under the gavel of Justice Elizabeth Ankomah when The New Crusading Guide’s Ace Investigative reporter, Anas Aremeyaw Anas, came face-to-face with the ‘dons’ of the Chinese sex mafia. The court had asked the reporter to come and play the audio and video evidence he had gathered in his six months investigations into the operations of the Chinese sex mafia within the West African sub region.\n" +
                "\n" +
                "The three dons, James Xu Jin, (first accused) Chou Xiou Ving, (second accused) and Sam Shan Zifan (third accused) were visibly shocked when the reporter started playing on a big screen, their activities of engaging the Chinese girls for exploitation.\n" +
                "\n" +
                "They could not dispute the content of the video “that is Sam taking money from that Whiteman and delivering that Chinese girl to the client for sexual exploitation. I am the one standing there in white with a bow- tie disguised as a bar tender and serving the alleged trafficker with beer in the hotel” Anas explained while playing the evidence to the court.\n" +
                "\n" +
                "Counsel for the accused persons Mr. B. O K.Johnson, Police Prosecutor ASP Ms Mary Agbozo were all present when Anas who was also the complainant in the case showed the evidence. Earlier Anas had tendered 8 audio clips, 2 videos, 9 transcript of conversations and photographs all marked as exhibits to the court.\n" +
                "\n" +
                "In his evidence- in- chief, Anas narrated how he conducted his investigations to the court, pointing out that his investigations were motivated by his interest in saving humanity. He narrated how he posed as a bar tender in a hotel to obtain evidence of the girls being sexually exploited. He explained that he befriended a lady in the residence of the traffickers in order to get information on their operations at their La residence (Agyeman) a suburb of Accra.\n" +
                "\n" +
                "He told the court that, he monitored the girls for over six months within which he saw them being sent out to casinos, hotels and saw men also coming out from the residence of the accused persons. He also added that, one of his sources had also been having conversations with the victims, in connection with their activities and had on tape all the conversations.\n" +
                "\n" +
                "During the cross examination by the defense counsel, Mr. B. O K. Johnson, Anas (witness) indicated that his friendship with the house maid of the accused persons was not amorous, but one of his ways as an undercover journalist to get information to prove his case.\n" +
                "\n" +
                "He denied an allegation that the housemaid of the accused smuggled him into the house saying “I was smuggled into the room by a source found condoms in the house, and picked only one which was unused from the first room”.\n" +
                "\n" +
                "Defense counsel also accused the witness of desiring to have sex with the girl he befriended in the residence of the traffickers but could not succeed because, James Xu Jin, (first accused) intervened and truncated the process. He said that witness had some hatred for first accused for truncating his sexual encounter and thereby decided to go undercover to do story to humiliate his client.\n" +
                "\n" +
                "“I put it to you that you wanted to have sex with the Chinese girls and when they refused, you developed hatred for them and thereby did this investigation, your investigation was borne by malice towards my clients”. The defense counsel told the court. “It is not so my lord”, Anas answered, the “Chinese girls do not have sex with blacks”.\n" +
                "\n" +
                "Mr. B. O. K Johnson also told the court that the money that was charged in the second operation of the witness was $100 not $150 as claimed by the witness saying “I put it to you that the money which was paid in the second operation was $100 and not $150”\n" +
                "\n" +
                "All seven victims who testified in court were seen trembling anytime they recounted the harrowing experiences they went through during their sexual activities. They therefore pleaded to be protected by the court for fear of being killed by the accused persons, who they regarded as very powerful.\n" +
                "\n" +
                "The girls, (names withheld) gave account of the fact that, Jin brought them to Ghana and for that matter they owed him and had to work to pay for their air fares and other traveling documents which Jin secured for them to facilitate their trip to Ghana.\n" +
                "\n" +
                "One of the victims, an 18 year old girl from Shangai in China could not hold back her tears as she narrated her story in the presence of the judge, journalists, prosecutors and defense counsel in chambers. The accused persons who were made to stand close to the door to enable them hear the proceedings were shocked beyond description. She stated that she was deceived by the accused persons that she was coming to Ghana to work in a Chinese restaurant only to end up in prostitution.\n" +
                "\n" +
                "According to the teenage girl, Jin and his wife Chow were her neighbours in china and that her parents allowed her to follow them because they assured her parents that, they were going to take good care of her.\n" +
                "\n" +
                "She admitted that, her family was poor and that her father owed her uncle and her auntie some money for a surgery performed on her father’s leg. She narrated that her father suffered injuries through an accident on his way to pick her up from school; this also resulted in her becoming a school dropout.\n" +
                "\n" +
                "She disclosed that her passport and other traveling documents were secured by Jin and after meeting at shanghai she was introduced to two other girls who came to Ghana with her.\n" +
                "\n" +
                "When they arrived in Ghana, the accused persons sent them to casinos but did not tell them exactly what to do. Later she was forced to sleep with a Lebanese, which was her first encounter in December 2007. She said she tried to resist the man but James severely beat her and told her he owned no restaurant. She reiterated that their slave master only made them have sex with white people and not blacks.\n" +
                "\n" +
                "She also said that anytime she refused Jin’s demands, she had to pay a penalty of $ 50 a day. ‘I had no choice but to do as I was told because I could not raise that amount’ Her slave master charged $70 per night or $40 per hour for men to sleep with her but kept all the money to himself with the justification that he was using the money to settle a $6, 000 debt accumulated from her visa and air fare.\n" +
                "\n" +
                "During cross- examination from counsel of the accused persons, Mr. O K Johnson, the witness told the court that, she could not tell her parent she was prostituting because it was an embarrassment.\n" +
                "\n" +
                "She said even though she knew the brothel was close to the La police station, she could not report the incident for fear of her life and those of her family back in china.\n" +
                "\n" +
                "However, the police are still searching for three of the victims, who were not available on the day of the raid.\n" +
                "\n" +
                "Hearing continues on Saturday 15th march, 2009 where our reporter is expected to be further cross examined.\n" +
                "\n" +
                "Please Stay tuned.]]>";
    }

    public static String getEnemiesOfANationStory() {
        return "<![CDATA[A veritable commercial beehive; the economic nerve centre of Ghana, sits on the shores of the Atlantic and overlooks the bubbling big blue sea. The sea breeze seems to have been directed purposely to produce a calming effect on the crammed and torrid atmosphere and on the bristling pace of business. The national flag, the Customs flag, and that of the Ports and Harbours go fluttering and flying at full mast. Gallant men and women resplendent in their uniform, complete with their berets embossed with the sacred Coat of Arms, walk around in high morale. Businessmen in their tuxedoes and clearing agents crisscross, moving from office to office with an air of tenacious dedication.\n" +
                "\n" +
                "Do not be deceived, some of these men in Ghana’s iconic harbour city are busily stealing from the most fertile vineyards of the motherland.\n" +
                "\n" +
                "The nation’s trusted farmhands at the Harbour have appropriated the farmland and its produce and denied their landlord (Ghana) the benefits due him. The Tema Harbour has been turned into a goldmine for some greedy security officials who are threatening to strip the mine facility to satisfy their selfish ends. Many officers from CEPS, the Ghana Police Service, National Security and the Ghana Ports and Habours Authority would do all it takes in the scramble to possess a piece of the prize.\n" +
                "\n" +
                "It is a dark and murky world at the Tema Harbour, as these security officials collaborate with some clearing agents to steal money belonging to the state through tax evasion, bribery and personal greed, thereby defeating the nation’s revenue mobilization efforts. Invariably, potential investors, importers and ordinary Ghanaians are made to bear the brunt of the selfishness and greed exhibited by these officers and agents because prices are passed over.\n" +
                "\n" +
                "These discoveries follow over three months of investigation by The New Crusading GUIDE into the operations of the Tema Harbour. Posing as a clearing agent under the name “Oblitey Sowah”, alias “Koose” from “Tiger Shipping agency”, Anas Aremeyaw Anas, together with a team of agents, obtained secret video footage on the daily cases of bribery and corruption that greet any importer or businessperson who calls at the port. Most importers are made to face the harsh realities of delays, payment of illegal fees, destruction and stealing of their goods as well as the sheer greed displayed by some security officers.\n" +
                "\n" +
                "The investigations also brought to light multiple cases of bribery, corruption, stealing, several cases of collusion between security officials and clearing agents as well as loss of goods belonging to importers as a result of inadequate security measures at the facility. The investigation uncovered some of the worst forms of bribery and corruption, lack of professionalism and glaring examples of stealing by these security officials at the port.\n" +
                "\n" +
                "Amidst all these corrupt activities, many agents have devised ways of adding the cost of bribe charges to the fees they usually charge importers. As a result, people who import goods into the country through the harbour go through unspeakable frustrations, not least the payment of huge sums of illegal charges which end up in the pockets of private individuals. In the process, it takes months to clear goods from the harbour. Sometimes, the nightmares of these importers are climaxed by the loss of their goods through theft or damages through mishandling. Over the years, there have been many reports of how unattractive the Harbour has become, with many importers channeling their frustrations through diverse ways. It is striking how very little has changed in the system.\n" +
                "\n" +
                "The New Crusading GUIDE also got access into the Customs Electronic system – a repository of all transactions that go on at the port – where we found very worrying cases of tax exemptions and unrecovered debts owed to the state worth billions of cedis. It brought to the fore many cases of tax exemption offered in the name of the Office of the President over the years. Many other exemptions were given out to individuals and companies on condition of “Awaiting Parliamentary Approval”.\n" +
                "\n" +
                "Here, we discovered that monies lost in bribery, corruption and some tax exemptions could help usher Ghana into an era of freedom from foreign donors.\n" +
                "\n" +
                "DODGY “AWAITING PARLIAMENTARY APPROVAL”, THAT NEVER WENT TO PARLIAMENT\n" +
                "\n" +
                "Many Businessmen and friends of politicians have over the years used their association to parliamentarians to evade taxes whenever they clear goods from the Tema Harbour. These individuals sometimes import goods in their names for family members and their companies.\n" +
                "\n" +
                "Undoubtedly, the use of the name of parliament has resulted in the state losing millions Cedis, as some government officials over the years deliberately abuse the system to clear goods for their business cronies.\n" +
                "\n" +
                "Our checks also revealed that even when the code is used to clear genuine goods, the much-awaited parliamentary approval never comes to validate it. It was horrifying to realize that some of these people never went to parliament for approval.\n" +
                "\n" +
                "Between March 2007 and December 2009, over GH¢ 900 million worth of tax exemptions was granted to some individuals and institutions in the name of “Parliament”. These tax exemptions were given out for goods ranging from medical equipment, household items, educational items and vehicles; with beneficiaries across public and private entities. Further figures obtained between January and November 2010 indicate that approximately GH¢ 17.9 million was lost by the state as a result of these special permits in the name of Parliament.\n" +
                "\n" +
                "Parliament is constitutionally mandated to handle all tax issues that border on finances. Part of Article 174(1) of the constitution under chapter 13, sub-headed “finance” states that “no taxation shall be imposed otherwise than by under the authority of an act of parliament”. In this light, no taxes can be levied on anybody unless it is done under an act of parliament.\n" +
                "\n" +
                "Although exemptions are given for special reasons based on parliamentary approval, The New Crusading GUIDE found out that the system was being abused by some individuals and organizations who always use the name of parliament to evade taxes. For the past six years, Parliament does not have any record of some of these exemptions.\n" +
                "\n" +
                "In an interview with The New Crusading GUIDE, Chairman of the Finance Committee in parliament, Hon James Avedzi said although parliament has conferred the power of granting exemptions on the Ministry of Finance, it does not have an idea which individuals or organizations have been granted exemptions over these years.\n" +
                "\n" +
                "“l have not seen anything like that as a deputy ranking member of the committee in 2007-2008 and as chairman from 2009 to 2010. l have not seen anything”, he admitted. Although he conceded that “the Ministry of Finance [is supposed] to do that on daily basis and report back to parliament after a period of time”. He was unable to state what period of time parliament is supposed to revise such exemptions.\n" +
                "\n" +
                "When presented with the evidence of exemptions to institutions and individuals as we discovered on the Electronic system, Hon James Avedzi simply said, “l will not talk about the value that we have seen because l do not know what goes into that 18 million Ghana Cedis you are talking about but it is possible that there is something like that you can see from the system”.\n" +
                "\n" +
                "THE WIDENING JAWS OF DEATH AND HOW OUR BROTHERS IN THE DIASPORA ARE TREATED\n" +
                "\n" +
                "Many Ghanaians leave the shores of the land to go and work in foreign lands in order to return someday to build a better life for their kith and kin. These men and women toil in sweatshops and endure harsh conditions in foreign lands just to provide for themselves and their families. They return to Ghana, their homeland, only to have their hopes dashed at the Tema Harbour. Long held dreams are blown apart, as they are not able to get hold of their valuable possessions.\n" +
                "\n" +
                "It usually is a tale of toil defeated by treachery, as Ghanaians who return from the Diaspora are always greeted with the grim reality of seeing their hard-earned properties stolen and destroyed by men at the Tema Harbour. When this happens, they are treated by port officials with so much disrespect and heartlessness. It is assumed that these Ghanaians have a lot to spend, little time to stay and fight for their goods. They [goods] are never found, although they spend sums of money in wearisome clearing process. Many are distressed in the process; those who endure usually leave the shores of Ghana with sad songs about their beloved country. It is a disturbing cycle of evil trumping goodwill.\n" +
                "\n" +
                "Becky Mensah is a Ghanaian-born philanthropist based in Canada. In January last year, Becky, with the help of some friends and benevolent institutions in Canada, collected some materials to help students of an educational institution in Cape Coast.\n" +
                "\n" +
                "They shipped a 40-foot container loaded with educational materials, computers, sewing machines, food items and a boxful of household effects to help support Ghanaian school children.\n" +
                "\n" +
                "Although the container, which was addressed in the name of the Paramount chief of Cape Coast, was originally destined for the Takoradi Harbour, it never arrived. Becky eventually had to travel from Canada to Ghana to locate it. After a long search, the container records were finally found at the Tema Harbour in June 2010.\n" +
                "\n" +
                "She was asked by Port authorities to pay the necessary duties in order to have her container released. With the help of her agents, she paid the required fees, totaling about GHc 5000. Yet, it took another five months and a trip back to Ghana to see her container. When she finally got access to it in November 2010, it had been broken into, with almost half the humanitarian items stolen.\n" +
                "\n" +
                "“When we got there, the customs officer checked without tag on our papers, the tag number and check the thing that closes the container, the seal that seals the container and the numbers did not match but the thing that was to my surprise was one of the carrier there just got closer to it and he just wiggled the thing and the whole thing opened”, she told The New Crusading GUIDE in an interview.\n" +
                "\n" +
                "Among other things, three laptops, 800 stuffed backpacks for students, 68 bedspreads, 4 sewing machines, a boxful of household items and several bottles of water were stolen. Nobody gave her any answers and she had to make do with a half-empty container which she took to Cape Coast to support needy students. Becky has finally returned to Canada after this trouble with port authorities. In all, she lost goods worth over one 120,000 dollars.\n" +
                "\n" +
                "When she approached security officials at the port, they refused to pay any attention to her. “I was actually shocked, but the customs guy never said a word. l started to complain to him and he just walked away”, she said with tearful eyes. “There was a group of them sitting under a tree and l said to them ‘will you guys help us’, they just stared at our face and didn’t say one word. It was so humiliating and painful, these people in uniform at the Harbour, we their customers were standing there and saying ‘can you see what has happened to us’; our container is almost empty. But all four of them sat there and just stared at us as l looked on helplessly”.\n" +
                "\n" +
                "Like Becky, countless individuals have harrowing tales of abuse they endure when they ship goods from various destinations to Ghana through the Tema port.\n" +
                "\n" +
                "Emmanuel Ahulu, a Ghanaian who recently returned from Virginia in the United States of America also had a similar story. After shipping a brand new car, together with goods through the Tema Harbour, Emmanuel got to Ghana only to realize that all his goods were stolen and his car badly dented. This was after he had engaged the services of a clearing agent, done the necessary documentations and got assured that “things were under control”.\n" +
                "\n" +
                "“Everything in the car actually was stolen. l couldn’t find anything, items that were bought and packed in the car actually in their brand new state – in boxes and in bags – everything was gone, nothing had been left”, he told The New Crusading GUIDE. “The car trunk was broken and they entered it and took every item that l brought”, he added.\n" +
                "\n" +
                "When he approached port officials, Emmanuel was greeted with the same fate as Becky: he could not get anyone to listen to his plight. He has since threatened legal action.\n" +
                "\n" +
                "“l believe that the next line of action is that the authority be held responsible, whoever is in charge of those terminals, whoever is in charge of those containers or all the cars that come in. l think he should be held responsible and he should be accountable for if that is done, l believe very well we are going to get somewhere; we are going to get to the bottom of this”, he said.\n" +
                "\n" +
                "It appears security officers who are mandated to take care of the port have failed woefully in the performance of their duties. Apart from the numerous cases of bribe-taking we witnessed, little can be said about the role these officials play at the port. Sometimes, they look on as agents and some people break into and sell goods in containers belonging to some importers in the full glare of the public.\n" +
                "\n" +
                "Johnson Clarkson, an investor from the United Kingdom also faced a similar ordeal at the port. In an interview with The New Crusading GUIDE, he narrated how over hundred bicycles which he shipped from the United Kingdom to support Ghanaian farmers in the Brong Ahafo Region got missing.\n" +
                "\n" +
                "“After going through hell to pay all those duties, I was bewildered when I found more than half of my goods missing”, he told the paper. He has since returned to his country, after he could not get any response from the Harbour Police and port authorities.\n" +
                "\n" +
                "Nii Lantey Okunka Bannerman, a Ghanaian living in the Diaspora, once posted an article on Ghanaweb titled “Belly of the Beast”. It was a recount of his experiences in clearing a car at the Tema Harbour sometime in 2005. Nii Lantey, in an apparent state of exasperation, wrote about how his car got “trapped” in the “jaws of death” [the Tema Harbour], citing an unending web of bribe taking, bureaucratic bottlenecks and acts of collusion which hamper the smooth clearing of goods from the port.\n" +
                "\n" +
                "More than five years on, it appears little has been done to turn the toxic-breathing jaws of the harbour into a friendly environment for importers. The cases of Becky Mensah, Emmanuel Ahulu are the recurring features in the unchanging script of the Harbour story.\n" +
                "\n" +
                "<b>THE CANADIAN SAGA</>\n" +
                "\n" +
                "Following the experiences of Becky Mensah, The New Crusading GUIDE made a trip to Canada to assess the Canadian situation. True to Becky’s accounts, the ports in Canada – including Port Calgary, where she shipped the container from – are orderly and well managed. There is an absence of corruption and most of the systems are automated. It is difficult to find port officials demanding bribes from importers and exporters. Also, goods shipped to meet Humanitarian needs are exempted from all taxes or duties.\n" +
                "\n" +
                "There were also no reports of stealing as exists in the Ghanaian setting. Undoubtedly, Canada provides an example for Ghanaian officials in-charge of the ports to emulate. Like other developed countries, the Canadian ports have very efficient systems which make shipping less stressful.\n" +
                "\n" +
                "In an interview with Prof Atsu Amegashie, an Associate Proffessor in the Department of Economics at the University of Guelph in Canada, he stated that the problem of revenue leakages can only be solved if the authorities take serious actions.\n" +
                "\n" +
                "“There’s the need for a committed leadership, that is willing to incentivize and induce agents to go after corrupt officials who are in charge of tax administration”, he opined.\n" +
                "\n" +
                "The Professor, who is also a Ghanaian, maintained that the Canadian situation offers a shining example for Ghanaians to follow.\n" +
                "\n" +
                "<b>OFFICE OF THE PRESIDENT AND THE TYCOONS</b>\n" +
                "\n" +
                "Beyond the disturbing spate of corruption between security officials and clearing agents, the abuse of the name of Parliament and the fate of those from the Diaspora who clear goods through the Harbour, The New Crusading GUIDE also uncovered a tide of sleazy deals which stretch even higher. The “Office of the President” has also been used over the years as a rubber stamp by certain individuals and organizations to rob the state of its needed revenue.\n" +
                "\n" +
                "Section 44 of the Customs, Excise &amp; Preventive Service (Management) Law provides the legal basis for CEPS to grant exemption from the payment of import duty to privileged persons, like THE PRESIDENT. This position is exemplified as Tariff No. 3AF.1 of PART A of the THIRD SCHEDULE of the CEPS Tariff at page 653.\n" +
                "\n" +
                "Thus, “OFFICE OF THE PRESIDENT”, which is under the Ministry of Presidential Affairs, is different from \"THE PRESIDENT”. Office of the President does not enjoy any duty and tax exemption under the laws of Ghana. The exemption covers items imported or purchased locally by the President for his personal use, not items imported or purchased locally by the state. These exempted items are the personal property of the President. For the present purposes, these are items imported or purchased by the person who, for the time being is the President of Ghana. These are items that he will continue to own, even when he is no longer President of the Republic of Ghana.\n" +
                "\n" +
                "For instance, an official who works in the office of the President cannot clear his goods for free simply because he works in the office of the President. The New Crusading GUIDE however, discovered that the rights given to the President were abused by senior officials of various governments. Goods, which had nothing to do with the President’s person, had found themselves being cleared in the name of the office of the President by various government officials. This is done usually without the President’s knowledge.\n" +
                "\n" +
                "Discoveries on the system total exemptions under the code, indicated that the office of the president comes to GHC14, 190, 336 (an equivalent of 9, 511, 000 dollars). An examination of the entries as sighted had questionable declarations, including luxury vehicles imported under the name of a member of parliament, assorted used vehicles, used clothing, fish meal, second hand air conditioners, second hand sewing machines and rather non-presidential materials.\n" +
                "\n" +
                "“I am shocked at this list because I know our Presidents do not use used cars. I also do not know any of our Presidents who has a poultry farm. So why these second hand cars and imported fishmeal by the Office of the President?” asked an official at the Finance Ministry when he saw the list of special permits in the name of the President.\n" +
                "\n" +
                "We found out that, the Ministry of Finance had also had its fair share of granting exemptions. It had granted permit for the clearance of goods without permit to the tune of about 5million Ghana Cedis (an equivalent of over 3 million two hundred dollars).\n" +
                "\n" +
                "<b>GHANA’S GOLDFIELD STRIP-MINED BY MEN IN UNIFORM PAID TO SECURE IT</b>\n" +
                "\n" +
                "The police, Customs Excise and Preventive Service, Ghana Ports and Harbours Authority Security, officials from National Security are fully engaged in bribery and corruption. They usually demand specific amounts from agents who are found evading tax through mis-classification, under-valuation or over-valuation of goods. Sometimes, they demand money before allowing entry into certain points within the port or before signing documents for the agents.\n" +
                "\n" +
                "It is common to see security officials admonishing agents to learn how to give bribes. “Without this, you cannot succeed in this business”, they usually say. On one occasion, we encountered a Senior CEPS officer named Mr. Kwakye at the CEPS laboratory who demanded money before approving our goods. When The New Crusading GUIDE could not pay the money the officer demanded, this is part of what transpired:\n" +
                "\n" +
                "<b>LAB MAN:</b> You! See you should always remember that, this is like when you come, next time come here again, and then you have become our friend. You see!\n" +
                "<b>TIGER:</b> Yeah! Yeah!\n" +
                "<b>LAB MAN:</b> So how much are you saying?\n" +
                "<b>TIGER:</b> Boss! Boss! Let me give you GHC 50\n" +
                "<b>LAB MAN:</b> How much? GHC 50, add something\n" +
                "<b>TIGER:</b> Pardon sir?\n" +
                "<b>LAB MAN:</b> Add something; is that all you have?\n" +
                "<b>TIGER:</b> That is why I am saying…\n" +
                "<b>LAB MAN:</b> You cannot say anything\n" +
                "<b>TIGER:</b> We can be saying something which will be looking so provocative, you being in the system and this being our first time, you can tell us this is how we are doing it and we also say oh! So far as this is our first time, Boss we, we are now becoming friends.\n" +
                "<b>LAB MAN:</b> You just make it GHC 100\n" +
                "<b>TIGER:</b> GHC100?\n" +
                "<b>LAB MAN:</b> Nice lady and nice like this, you are thinking of opening your company in the future, you have to know certain things on the ground, you see!\n" +
                "\n" +
                "<b>TIGER:</b> Yes sir!\n" +
                "<b>LAB MAN:</b> But if you start with your hands like this…\n" +
                "<b>TIGER:</b>Oh! No sir that is not that <b>LAB MAN:</b> If you open your company things will not go well\n" +
                "\n" +
                "On another occasion, this reporter met a GPHA Security official who demanded money before allowing him entry into the port:\n" +
                "\n" +
                "<b>SECURITY MAN:</b> You be agent?\n" +
                "<b>TIGER:</b>Yeah!\n" +
                "<b>SECURITYMAN:</b> Then you get money, bring am make l chop inside. Yes! Bring your requirements. I go chop ooh!!\n" +
                "<b>TIGER:</b>You go chop?\n" +
                "<b>SECURITYMAN:</b> I go chop small one\n" +
                "<b>TIGER:</b>No! Problem\n" +
                "<b>OFFICER:</b> No be big one\n" +
                "\n" +
                "Clearly, the case of bribery and corruption as it exists between agents and CEPS has far-reaching consequences as far as national revenue mobilization is concerned. As these shady deals come to a head, current and potential investors are seriously frustrated as agents normally include the proverbial “Bribe-fees” to their charges. Though most importers overlook the illegality and pay these monies, they sometimes go through hell to get access to their goods. The cases of Becky Mensah and Emmanuel Ahulu typify the order at the Tema Harbour.\n" +
                "\n" +
                "<b>BETWEEN CORRUPTION AND FOREIGN AID</b>\n" +
                "\n" +
                "Financial and policy experts have suggested that Ghana could wean itself off donor support if those in charge of Ghana’s ports city worked hard enough and cut out the corruption and negligence. The exemption system granted under the name of Parliament and the Office of the President has been abused, and this has taken a toll on the National treasury.\n" +
                "\n" +
                "“The situation where it seems as if these exemptions were being abused instead of bringing in materials and the rest that will prop up our economy becomes worrying”, says Dr. Lloyd Amoah, a policy analyst and professor at Ashesi University. To put an end to the incessant borrowing by government, he maintains that the Harbour, as an entry point, “provides a lot of revenue and so it means that fundamentally for a developing country this ought to be looked at critically”.\n" +
                "\n" +
                "A senior fellow at IMANI Ghana, Kofi Bentil, also argued, that “If we manage our ports well, we could actually make more money out of the port system than we are making out of cocoa for instance”.\n" +
                "\n" +
                "He continued, “If we were to make services a central issue in this economy, it is possible that we will improve the economy, l means government revenue, and actually serve the sub-regions, and one of the areas l identified as a note for such service economy is the port system. Between Tema and Takoradi port, we can actually establish a system which will serve the whole West Africa sub-region”.\n" +
                "\n" +
                "The question of Ghana’s inability to meet its revenue targets is more an issue of mismanagement and corruption rather than the lack of resources.\n" +
                "\n" +
                "The World Bank Country director to Ghana, Ishac Diwan, believes Ghana’s revenue mobilization efforts needs to be improved.\n" +
                "\n" +
                "“ The various taxes need to be linked together in a database so that, knowing how much VAT, how much volume of business which is useful for the VAT, informs the tax authority about incomes and profits so that cooperate taxes can be collected. So, there is the need for more efficiency in terms of the different services working together and finally, also, facilitating the entry of business into the formal economy”, he says.\n" +
                "\n" +
                "“It is very important to close the loop falls and to have a more disciplined system. There are just too many exemptions that have been granted left and right through lobbying by the various industries, sectors, companies”, he points out.\n" +
                "\n" +
                "Coming up: Tomorrow, we bring you the story of how GCNet, Ghana Ports and Harbours Authority (GPHA) and Destination Inspection Companies have contributed to the loss of huge sums of money belonging to the State. The electronic system, the Ghana Customs Management System (GCMS) is the repository of all transactions engaged in by both genuine and dubious businesspersons across the length and breadth of the country. It is only a select few of special people who know the secrets and can interpret the electronic system. We got in there and found out all the dirty tricks used to evade tax and starve mother Ghana. The story takes you through the raw deal that the state suffers as a result of acts by these institutions. It is Part two of the Enemies of the Nation. We also bring you details of how Deputy CEPS Commissioner, Annie Anipa played merry-go-round with The New Crusading GUIDE in the unfolding saga.]]>\n";
    }

    public static boolean isAuthenticated() {
        return authenticated;
    }
}
