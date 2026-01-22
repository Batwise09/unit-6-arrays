package Lesson3_ClassroomArray;


/**
 * Creates 5 students, puts them in an array and prints them all out.
 *
 * @author - Samwise Shurtleff
 * @version - 1/22/26
 */
public class Main
{
    public static void main(String[] args)
    {
        Student bbj = new Student("Billy Bob", "Joe", 11);
        Student ddbj3j = new Student ("Demetrius Demarcus Bartholomew", "James III Jr.", 5);
        Student spiderman = new Student("Peter", "Parker", 12);
        Student mj = new Student("Michael", "Jackson", 12);
        Student finalBoss = new Student("M̷̧̨̧̜̗̠̝͉͚̺̝̗̗͉̣͇̼̪̫̔̈i̵̡̨̫͉̲͔̘͕͓̤͕͐́͋́̀̈́̃̒̍̈̏͛́͂̕͘͝͠t̶̜̆͆h̸̛̯̗͈̬̙̥̖̼͇͓̦̘͍̭̔̾́͊́͊͆̊͊͋̀͘̚͝͝r̵̟̤̤̥̖͓̔͑̇̇̊̎̐̅͆̒̈̓́̍̿͊̽̚͝͝į̶͎̜̱̖̩͚͖̣͖͈͓̭̖͐̈̇͗̃͐̉͆͗̿͜͜͝x̶̛̦͗̓̑̅̓́͛̉͒̔͗͂̚͝͝͠", "Ķ̷̧̧̧̰̝̻̮̬̤͖̠̱͔̀́̀̓̍̋̑̊̅́̅̾i̸̧̢̨̡̥̖̣̼̣̜̬̯̯̫̻̫̗̙̹͖͙̜̯͆͋͒͐̌̈́͝ņ̷͍͈̠̳͗̃g̵̢̡̧̨̡̨̧̛̺̤̞̜̫̯̖͓̜̠̹͓̪͓̾͂͗̑͝ ̶̨͈̠̲̏͋̎̐̈͐͌̋̑͗͠͠ǫ̵̠͎̮̙̹͔͖̜͈͍̹̰̗̙̙̥͍͕̝̺̈́̊̔͒͛̅͆̆̋̿͗͒̀͗̚̕͜͝ͅf̴̨̮͎́̅̂̈́͊͋̌̈́̿̈́̈͛̾͛̀̿͊͗̓͠͠͝ ̴̨̛͔͕͖͕̦̙̞̹̻̮̳̯͚̫̰͎̘͂̔́̍̈́̇̀̔̿̓̈́̿̈̊̿͗͊̀͗͋͝ͅN̶̛̻̗̹̺̽̈́͒o̴̧͈̩̟̩̻̙̮̟̙͗͂̌͛̐͆̈́͑͒̐̈͐̈̓̌̐̌̈́̾̚͝ẗ̴͚͎͓̣̦̪̥̯͎͕͖͙͔̺́̃́̅̒̀̓̂̑̿̓͒̕̚̕̚̚͝ͅh̸̨̦͕͙͎̮͕̫͓̯̩̺̘̲͚̻͎͖́̽́̈͌͊́̋ï̶̧̛̪̜̤̩̀͛̐͝n̵̡̯͚̤͎̱̹̥͙̬̩̜͉͇̘̩̞͕̓͗͌͗̔͑̎̐̚͝g̴̢̞͊̊̓̈́̃̍̔̾͌̌͋͌̾͛̽͊͘̕̚͜", 67);
        
        Student[] students = {bbj, ddbj3j, spiderman, mj, finalBoss};
        
        for (Student pupil : students)
        {
            System.out.println(pupil);
        }
    }
}
