package md222xq_assign3;

public class GameMechanics {

    public void startGame (Hero good , Enemy bad){


        int counter = 0;

        while (good.getXP() > 0) {

            int badXP = bad.getXP();
            int goodXP = good.getXP();

            if(badXP <= 0){
                break;
            }

            counter++;
            System.out.println("---------------------------------------------------------");
            System.out.println("----------------------Round: " + counter +"---------------------------");
            System.out.println("---------------------------------------------------------");
            System.out.println();
            System.out.println( good.getName() +"'s XP: " + goodXP);
            System.out.println( bad.getName() + "'s XP: " + badXP);
            System.out.println();



            int goodAttack = good.doAttack();
            int badXPAfter = badXP - goodAttack;
            int badAttack = bad.doAttack();
            int goodXPAfter = goodXP - badAttack;

            int goodDefence = good.doDefence();
            int badDefence = bad.doDefence();

            if (good.doAttack() > bad.doDefence()) {

                if (goodXP <= 0) break;

                else {


                    bad.setXP(badXPAfter);

                    System.out.println(good.getName() + " dealt " + goodAttack + " damage, leaving " + bad.getName() + " with " + badXPAfter + " XP");
                    //System.out.println();
                }
            }


            else  {
                System.out.println(good.getName() +" dealt no damage!");

            }


            if (badXP < 0) break;



            if (bad.doAttack() > good.doDefence()) {

                if (badXP <= 0){
                    break;
                }

                else {
                    good.setXP(goodXPAfter);

                    System.out.println(bad.getName() + " dealt " + badAttack + " damage, leaving " + good.getName() + " with " + goodXPAfter + " XP");
                    System.out.println();
                }

            }

            else {

                System.out.println(bad.getName() + " dealt no damage! ");
                System.out.println();

            }


        }


        if (bad.getXP() <= 0){
            System.out.println("*********************************************************");
            System.out.println("************* " + bad.getName() + " has been defeated *************" );
            System.out.println("*********************************************************");


        }
        else if (good.getXP() <= 0 ){
            System.out.println("*********************************************************");
            System.out.println("************* " + good.getName() + " has been defeated *************" );
            System.out.println("*********************************************************");


        }
        System.out.println();

    }
}

