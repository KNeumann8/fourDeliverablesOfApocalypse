import java.util.Scanner;

public class Enums {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is you favorite NBA team?");
        String input = keyboard.nextLine();


        StringBuilder threeFirst = new StringBuilder(3);

        threeFirst.append(input.charAt(0));
        threeFirst.append(input.charAt(1));
        threeFirst.append(input.charAt(2));

        input = threeFirst.toString().toLowerCase();

        //System.out.println(input);



        Team[] hopefullyAllOfThem = Team.values();
        for(Team t : hopefullyAllOfThem){
            boolean foundTeam = false;

            //System.out.println(t.getName());

            StringBuilder teamName = new StringBuilder(3);
            teamName.append(t.getName().charAt(0));
            teamName.append(t.getName().charAt(1));
            teamName.append(t.getName().charAt(2));

            if(input.equals(teamName.toString().toLowerCase())) foundTeam = true;

            StringBuilder teamCity = new StringBuilder(3);
            teamCity.append(t.getCity().charAt(0));
            teamCity.append(t.getCity().charAt(1));
            teamCity.append(t.getCity().charAt(2));

            if(input.equals(teamCity.toString().toLowerCase())) foundTeam = true;

            if(foundTeam){
                System.out.println("Your favorite team is:");
                System.out.println(t.getCity() +" "+ t.getName());
            }

        }




    }

}
