import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        int teteDeBoeufJoueur1 = 0;
        int teteDeBoeufBot1 = 0;
        int teteDeBoeufBot2 = 0;
        int teteDeBoeufBot3 = 0;




        int min = 1;
        int max = 104;
        int count = 44;

        Set<Integer> numbers = new HashSet<>();
        Random random = new Random();

        while (numbers.size() < count) {
            int randomNumber = random.nextInt(max - min + 1) + min;
            if (!numbers.contains(randomNumber)) {
                numbers.add(randomNumber);
            }
        }

        int[] randomArray = new int[count];
        int index = 0;
        for (int number : numbers) {
            randomArray[index] = number;
            index++;
        }

        Arrays.sort(randomArray, 0, 10);

        int Carte1Joueur = randomArray[0];
        int Carte2Joueur = randomArray[1];
        int Carte3Joueur = randomArray[2];
        int Carte4Joueur = randomArray[3];
        int Carte5Joueur = randomArray[4];
        int Carte6Joueur = randomArray[5];
        int Carte7Joueur = randomArray[6];
        int Carte8Joueur = randomArray[7];
        int Carte9Joueur = randomArray[8];
        int Carte10Joueur = randomArray[9];


        Arrays.sort(randomArray, 10, 20);


        int Carte1Bot1 = randomArray[10];
        int Carte2Bot1 = randomArray[11];
        int Carte3Bot1 = randomArray[12];
        int Carte4Bot1 = randomArray[13];
        int Carte5Bot1 = randomArray[14];
        int Carte6Bot1 = randomArray[15];
        int Carte7Bot1 = randomArray[16];
        int Carte8Bot1 = randomArray[17];
        int Carte9Bot1 = randomArray[18];
        int Carte10Bot1 = randomArray[19];


        Arrays.sort(randomArray, 20, 30);

        int Carte1Bot2 = randomArray[20];
        int Carte2Bot2 = randomArray[21];
        int Carte3Bot2 = randomArray[22];
        int Carte4Bot2 = randomArray[23];
        int Carte5Bot2 = randomArray[24];
        int Carte6Bot2 = randomArray[25];
        int Carte7Bot2 = randomArray[26];
        int Carte8Bot2 = randomArray[27];
        int Carte9Bot2 = randomArray[28];
        int Carte10Bot2 = randomArray[29];

        Arrays.sort(randomArray, 30, 40);

        int Carte1Bot3 = randomArray[30];
        int Carte2Bot3 = randomArray[31];
        int Carte3Bot3 = randomArray[32];
        int Carte4Bot3 = randomArray[33];
        int Carte5Bot3 = randomArray[34];
        int Carte6Bot3 = randomArray[35];
        int Carte7Bot3 = randomArray[36];
        int Carte8Bot3 = randomArray[37];
        int Carte9Bot3 = randomArray[38];
        int Carte10Bot3 = randomArray[39];

        Arrays.sort(randomArray, 40, 44);

        int CarteJeu1 = randomArray[40];
        int CarteJeu2 = randomArray[41];
        int CarteJeu3 = randomArray[42];
        int CarteJeu4 = randomArray[43];

        System.out.println("Ceci sont les 4 cartes sur le terrain : ");

        System.out.println(CarteJeu1);
        System.out.println(CarteJeu2);
        System.out.println(CarteJeu3);
        System.out.println(CarteJeu4);

        System.out.println("");


        int[] Ligne1 = new int[6];
        Ligne1[0] = CarteJeu1;
        Ligne1[1] = 0;
        Ligne1[2] = 0;
        Ligne1[3] = 0;
        Ligne1[4] = 0;
        Ligne1[5] = 0;


        int[] Ligne2 = new int[6];
        Ligne2[0] = CarteJeu2;
        Ligne2[1] = 0;
        Ligne2[2] = 0;
        Ligne2[3] = 0;
        Ligne2[4] = 0;
        Ligne2[5] = 0;


        int[] Ligne3 = new int[6];
        Ligne3[0] = CarteJeu3;
        Ligne3[1] = 0;
        Ligne3[2] = 0;
        Ligne3[3] = 0;
        Ligne3[4] = 0;
        Ligne3[5] = 0;


        int[] Ligne4 = new int[6];
        Ligne4[0] = CarteJeu4;
        Ligne4[1] = 0;
        Ligne4[2] = 0;
        Ligne4[3] = 0;
        Ligne4[4] = 0;
        Ligne4[5] = 0;



 while  (teteDeBoeufJoueur1 < 66 || teteDeBoeufBot1 < 66 || teteDeBoeufBot2 < 66 || teteDeBoeufBot3 < 66)  {


     System.out.println("Ceci sont vos cartes : ");


     System.out.println(Carte1Joueur);
     System.out.println(Carte2Joueur);
     System.out.println(Carte3Joueur);
     System.out.println(Carte4Joueur);
     System.out.println(Carte5Joueur);
     System.out.println(Carte6Joueur);
     System.out.println(Carte7Joueur);
     System.out.println(Carte8Joueur);
     System.out.println(Carte9Joueur);
     System.out.println(Carte10Joueur);



        int randomIndex1 = random.nextInt(10) + 1;
        int carteAleatoireBot1;
        carteAleatoireBot1 = 0;

        switch (randomIndex1) {
            case 1:
                carteAleatoireBot1 = Carte1Bot1;
                break;
            case 2:
                carteAleatoireBot1 = Carte2Bot1;
                break;
            case 3:
                carteAleatoireBot1 = Carte3Bot1;
                break;
            case 4:
                carteAleatoireBot1 = Carte4Bot1;
                break;
            case 5:
                carteAleatoireBot1 = Carte5Bot1;
                break;
            case 6:
                carteAleatoireBot1 = Carte6Bot1;
                break;
            case 7:
                carteAleatoireBot1 = Carte7Bot1;
                break;
            case 8:
                carteAleatoireBot1 = Carte8Bot1;
                break;
            case 9:
                carteAleatoireBot1 = Carte9Bot1;
                break;
            case 10:
                carteAleatoireBot1 = Carte10Bot1;
                break;
        }




        int randomIndex2 = random.nextInt(10) + 1;
        int carteAleatoireBot2;
        carteAleatoireBot2 = 0;

        switch (randomIndex2) {
            case 1:
                carteAleatoireBot2 = Carte1Bot2;
                break;
            case 2:
                carteAleatoireBot2 = Carte2Bot2;
                break;
            case 3:
                carteAleatoireBot2 = Carte3Bot2;
                break;
            case 4:
                carteAleatoireBot2 = Carte4Bot2;
                break;
            case 5:
                carteAleatoireBot2 = Carte5Bot2;
                break;
            case 6:
                carteAleatoireBot2 = Carte6Bot2;
                break;
            case 7:
                carteAleatoireBot2 = Carte7Bot2;
                break;
            case 8:
                carteAleatoireBot2 = Carte8Bot2;
                break;
            case 9:
                carteAleatoireBot2 = Carte9Bot2;
                break;
            case 10:
                carteAleatoireBot2 = Carte10Bot2;
                break;
        }




        int randomIndex3 = random.nextInt(10) + 1;
        int carteAleatoireBot3;
        carteAleatoireBot3 = 0;

        switch (randomIndex3) {
            case 1:
                carteAleatoireBot3 = Carte1Bot3;
                break;
            case 2:
                carteAleatoireBot3 = Carte2Bot3;
                break;
            case 3:
                carteAleatoireBot3 = Carte3Bot3;
                break;
            case 4:
                carteAleatoireBot3 = Carte4Bot3;
                break;
            case 5:
                carteAleatoireBot3 = Carte5Bot3;
                break;
            case 6:
                carteAleatoireBot3 = Carte6Bot3;
                break;
            case 7:
                carteAleatoireBot3 = Carte7Bot3;
                break;
            case 8:
                carteAleatoireBot3 = Carte8Bot3;
                break;
            case 9:
                carteAleatoireBot3 = Carte9Bot3;
                break;
            case 10:
                carteAleatoireBot3 = Carte10Bot3;
                break;
        }






        System.out.println("Quelles cartes souhaitez vous jouer ?");


        Scanner input = new Scanner(System.in);
        int carteJouee = 0;
        carteJouee = input.nextInt();

     System.out.println("Bot 1 joue la carte  : " + carteAleatoireBot1);
     System.out.println("Bot 2 joue la carte  : " + carteAleatoireBot2);
     System.out.println("Bot 3 joue la carte  : " + carteAleatoireBot3);



            if (carteJouee > Ligne4[0]) {
                if (carteJouee > Ligne4[1] && Ligne4[1] == 0) {
                    Ligne4[1] = carteJouee;
                }
                else {
                    if (carteJouee > Ligne4[2] && Ligne4[2] == 0) {
                        Ligne4[2] = carteJouee;
                    }
                    else {
                        if (carteJouee > Ligne4[3] && Ligne4[3] == 0) {
                            Ligne4[3] = carteJouee;
                        }
                        else {
                            if (carteJouee > Ligne4[4] && Ligne4[4] == 0) {
                                Ligne4[4] = carteJouee;
                            }
                            else {
                                if (carteJouee > Ligne4[5] && Ligne4[5] == 0) {
                                    Ligne4[5] = carteJouee;


                                    System.out.println("Vous encaissez les cartes de la quatrième ligne");
                                    System.out.println(carteJouee + "devient la première carte de la quatrième ligne.");

                                    if (Ligne4[0] % 10 == 5) {
                                        teteDeBoeufJoueur1 += 2;
                                    }

                                    else if (Ligne4[0] % 10 == 0) {
                                        teteDeBoeufJoueur1 += 3;
                                    }

                                    else if (Ligne4[0] % 11 == 0 && Ligne4[0] != 55) {
                                        teteDeBoeufJoueur1 += 5;
                                    }

                                    else if (Ligne4[0] == 55) {
                                        teteDeBoeufJoueur1 += 7;
                                    }
                                    else {
                                        teteDeBoeufJoueur1 += 1;
                                    }




                                    if (Ligne4[1] % 10 == 5) {
                                        teteDeBoeufJoueur1 += 2;
                                    }

                                    else if (Ligne4[1] % 10 == 0) {
                                        teteDeBoeufJoueur1 += 3;
                                    }

                                    else if (Ligne4[1] % 11 == 0 && Ligne4[1] != 55) {
                                        teteDeBoeufJoueur1 += 5;
                                    }

                                    else if (Ligne4[1] == 55) {
                                        teteDeBoeufJoueur1 += 7;
                                    }
                                    else {
                                        teteDeBoeufJoueur1 += 1;
                                    }


                                    if (Ligne4[2] % 10 == 5) {
                                        teteDeBoeufJoueur1 += 2;
                                    }

                                    else if (Ligne4[2] % 10 == 0) {
                                        teteDeBoeufJoueur1 += 3;
                                    }

                                    else if (Ligne4[2] % 11 == 0 && Ligne4[2] != 55) {
                                        teteDeBoeufJoueur1 += 5;
                                    }

                                    else if (Ligne4[2] == 55) {
                                        teteDeBoeufJoueur1 += 7;
                                    }
                                    else {
                                        teteDeBoeufJoueur1 += 1;
                                    }



                                    if (Ligne4[3] % 10 == 5) {
                                        teteDeBoeufJoueur1 += 2;
                                    }

                                    else if (Ligne4[3] % 10 == 0) {
                                        teteDeBoeufJoueur1 += 3;
                                    }

                                    else if (Ligne4[3] % 11 == 0 && Ligne4[3] != 55) {
                                        teteDeBoeufJoueur1 += 5;
                                    }

                                    else if (Ligne4[3] == 55) {
                                        teteDeBoeufJoueur1 += 7;
                                    }
                                    else {
                                        teteDeBoeufJoueur1 += 1;
                                    }



                                    if (Ligne4[4] % 10 == 5) {
                                        teteDeBoeufJoueur1 += 2;
                                    }

                                    else if (Ligne4[4] % 10 == 0) {
                                        teteDeBoeufJoueur1 += 3;
                                    }

                                    else if (Ligne4[4] % 11 == 0 && Ligne4[4] != 55) {
                                        teteDeBoeufJoueur1 += 5;
                                    }

                                    else if (Ligne4[4] == 55) {
                                        teteDeBoeufJoueur1 += 7;
                                    }
                                    else {
                                        teteDeBoeufJoueur1 += 1;
                                    }


                                    Ligne4[0] = carteJouee;

                                    Ligne4[1] = 0;
                                    Ligne4[2] = 0;
                                    Ligne4[3] = 0;
                                    Ligne4[4] = 0;
                                    Ligne4[5] = 0;



                                }
                                }



                            }
                        }
                    }

                }



            else if (carteJouee > Ligne3[0]) {

                if (carteJouee > Ligne3[1] && Ligne3[1] == 0) {
                    Ligne3[1] = carteJouee;
                }
                else {
                    if (carteJouee > Ligne3[2] && Ligne3[2] == 0) {
                        Ligne3[2] = carteJouee;
                    }
                    else {
                        if (carteJouee > Ligne3[3] && Ligne3[3] == 0) {
                            Ligne3[3] = carteJouee;
                        }
                        else {
                            if (carteJouee > Ligne3[4] && Ligne3[4] == 0) {
                                Ligne3[4] = carteJouee;
                            }
                            else {
                                if (carteJouee > Ligne3[5] && Ligne3[5] == 0) {
                                    Ligne3[5] = carteJouee;


                                    System.out.println("Vous encaissez les cartes de la troisième ligne");
                                    System.out.println(carteJouee + "devient la première carte de la troisième ligne.");

                                    if (Ligne3[0] % 10 == 5) {
                                        teteDeBoeufJoueur1 += 2;
                                    }

                                    else if (Ligne3[0] % 10 == 0) {
                                        teteDeBoeufJoueur1 += 3;
                                    }

                                    else if (Ligne3[0] % 11 == 0 && Ligne3[0] != 55) {
                                        teteDeBoeufJoueur1 += 5;
                                    }

                                    else if (Ligne3[0] == 55) {
                                        teteDeBoeufJoueur1 += 7;
                                    }
                                    else {
                                        teteDeBoeufJoueur1 += 1;
                                    }




                                    if (Ligne3[1] % 10 == 5) {
                                        teteDeBoeufJoueur1 += 2;
                                    }

                                    else if (Ligne3[1] % 10 == 0) {
                                        teteDeBoeufJoueur1 += 3;
                                    }

                                    else if (Ligne3[1] % 11 == 0 && Ligne3[1] != 55) {
                                        teteDeBoeufJoueur1 += 5;
                                    }

                                    else if (Ligne3[1] == 55) {
                                        teteDeBoeufJoueur1 += 7;
                                    }
                                    else {
                                        teteDeBoeufJoueur1 += 1;
                                    }


                                    if (Ligne3[2] % 10 == 5) {
                                        teteDeBoeufJoueur1 += 2;
                                    }

                                    else if (Ligne3[2] % 10 == 0) {
                                        teteDeBoeufJoueur1 += 3;
                                    }

                                    else if (Ligne3[2] % 11 == 0 && Ligne3[2] != 55) {
                                        teteDeBoeufJoueur1 += 5;
                                    }

                                    else if (Ligne3[2] == 55) {
                                        teteDeBoeufJoueur1 += 7;
                                    }
                                    else {
                                        teteDeBoeufJoueur1 += 1;
                                    }



                                    if (Ligne3[3] % 10 == 5) {
                                        teteDeBoeufJoueur1 += 2;
                                    }

                                    else if (Ligne3[3] % 10 == 0) {
                                        teteDeBoeufJoueur1 += 3;
                                    }

                                    else if (Ligne3[3] % 11 == 0 && Ligne3[4] != 55) {
                                        teteDeBoeufJoueur1 += 5;
                                    }

                                    else if (Ligne3[3] == 55) {
                                        teteDeBoeufJoueur1 += 7;
                                    }
                                    else {
                                        teteDeBoeufJoueur1 += 1;
                                    }



                                    if (Ligne3[4] % 10 == 5) {
                                        teteDeBoeufJoueur1 += 2;
                                    }

                                    else if (Ligne3[4] % 10 == 0) {
                                        teteDeBoeufJoueur1 += 3;
                                    }

                                    else if (Ligne3[4] % 11 == 0 && Ligne3[4] != 55) {
                                        teteDeBoeufJoueur1 += 5;
                                    }

                                    else if (Ligne3[4] == 55) {
                                        teteDeBoeufJoueur1 += 7;
                                    }
                                    else {
                                        teteDeBoeufJoueur1 += 1;
                                    }


                                    Ligne3[0] = carteJouee;
                                    Ligne3[1] = 0;
                                    Ligne3[2] = 0;
                                    Ligne3[3] = 0;
                                    Ligne3[4] = 0;
                                    Ligne3[5] = 0;



                                }


                            }

                        }
                    }
                }

            }

            else if (carteJouee > Ligne2[0]) {

                if (carteJouee > Ligne2[1] && Ligne2[1] == 0) {
                    Ligne2[1] = carteJouee;
                }
                else {
                    if (carteJouee > Ligne2[2] && Ligne2[2] == 0) {
                        Ligne2[2] = carteJouee;
                    }
                    else {
                        if (carteJouee > Ligne2[3] && Ligne2[3] == 0) {
                            Ligne2[3] = carteJouee;
                        }
                        else {
                            if (carteJouee > Ligne2[4] && Ligne2[4] == 0) {
                                Ligne2[4] = carteJouee;
                            }
                            else {
                                if (carteJouee > Ligne2[5] && Ligne2[5] == 0) {
                                    Ligne2[5] = carteJouee;


                                    System.out.println("Vous encaissez les cartes de la deuxième ligne");
                                    System.out.println(carteJouee + "devient la première carte de la deuxième ligne.");

                                    if (Ligne2[0] % 10 == 5) {
                                        teteDeBoeufJoueur1 += 2;
                                    }

                                    else if (Ligne2[0] % 10 == 0) {
                                        teteDeBoeufJoueur1 += 3;
                                    }

                                    else if (Ligne2[0] % 11 == 0 && Ligne2[0] != 55) {
                                        teteDeBoeufJoueur1 += 5;
                                    }

                                    else if (Ligne2[0] == 55) {
                                        teteDeBoeufJoueur1 += 7;
                                    }
                                    else {
                                        teteDeBoeufJoueur1 += 1;
                                    }




                                    if (Ligne2[1] % 10 == 5) {
                                        teteDeBoeufJoueur1 += 2;
                                    }

                                    else if (Ligne2[1] % 10 == 0) {
                                        teteDeBoeufJoueur1 += 3;
                                    }

                                    else if (Ligne2[1] % 11 == 0 && Ligne2[1] != 55) {
                                        teteDeBoeufJoueur1 += 5;
                                    }

                                    else if (Ligne2[1] == 55) {
                                        teteDeBoeufJoueur1 += 7;
                                    }
                                    else {
                                        teteDeBoeufJoueur1 += 1;
                                    }


                                    if (Ligne2[2] % 10 == 5) {
                                        teteDeBoeufJoueur1 += 2;
                                    }

                                    else if (Ligne2[2] % 10 == 0) {
                                        teteDeBoeufJoueur1 += 3;
                                    }

                                    else if (Ligne2[2] % 11 == 0 && Ligne2[2] != 55) {
                                        teteDeBoeufJoueur1 += 5;
                                    }

                                    else if (Ligne2[2] == 55) {
                                        teteDeBoeufJoueur1 += 7;
                                    }
                                    else {
                                        teteDeBoeufJoueur1 += 1;
                                    }



                                    if (Ligne2[3] % 10 == 5) {
                                        teteDeBoeufJoueur1 += 2;
                                    }

                                    else if (Ligne2[3] % 10 == 0) {
                                        teteDeBoeufJoueur1 += 3;
                                    }

                                    else if (Ligne2[3] % 11 == 0 && Ligne2[3] != 55) {
                                        teteDeBoeufJoueur1 += 5;
                                    }

                                    else if (Ligne2[3] == 55) {
                                        teteDeBoeufJoueur1 += 7;
                                    }
                                    else {
                                        teteDeBoeufJoueur1 += 1;
                                    }



                                    if (Ligne2[4] % 10 == 5) {
                                        teteDeBoeufJoueur1 += 2;
                                    }

                                    else if (Ligne2[4] % 10 == 0) {
                                        teteDeBoeufJoueur1 += 3;
                                    }

                                    else if (Ligne2[4] % 11 == 0 && Ligne2[4] != 55) {
                                        teteDeBoeufJoueur1 += 5;
                                    }

                                    else if (Ligne2[4] == 55) {
                                        teteDeBoeufJoueur1 += 7;
                                    }
                                    else {
                                        teteDeBoeufJoueur1 += 1;
                                    }


                                    Ligne2[0] = carteJouee;
                                    Ligne2[1] = 0;
                                    Ligne2[2] = 0;
                                    Ligne2[3] = 0;
                                    Ligne2[4] = 0;
                                    Ligne2[5] = 0;



                                }
                            }
                        }
                    }
                }
            }


            else if (carteJouee > Ligne1[0]) {
                if (carteJouee > Ligne1[1] && Ligne1[1] == 0) {
                    Ligne1[1] = carteJouee;
                }
                else {
                    if (carteJouee > Ligne1[2] && Ligne1[2] == 0) {
                        Ligne1[2] = carteJouee;
                    }
                    else {
                        if (carteJouee > Ligne1[3] && Ligne1[3] == 0) {
                            Ligne1[3] = carteJouee;
                        }
                        else {
                            if (carteJouee > Ligne1[4] && Ligne1[4] == 0) {
                                Ligne1[4] = carteJouee;
                            }
                            else {
                                if (carteJouee > Ligne1[5] && Ligne1[5] == 0) {
                                    Ligne1[5] = carteJouee;

                                    System.out.println("Vous encaissez les cartes de la première ligne");
                                    System.out.println(carteJouee + "devient la première carte de la première ligne.");

                                    if (Ligne1[0] % 10 == 5) {
                                        teteDeBoeufJoueur1 += 2;
                                    }

                                    else if (Ligne1[0] % 10 == 0) {
                                        teteDeBoeufJoueur1 += 3;
                                    }

                                    else if (Ligne1[0] % 11 == 0 && Ligne1[0] != 55) {
                                        teteDeBoeufJoueur1 += 5;
                                    }

                                    else if (Ligne1[0] == 55) {
                                        teteDeBoeufJoueur1 += 7;
                                    }
                                    else {
                                        teteDeBoeufJoueur1 += 1;
                                    }




                                    if (Ligne1[1] % 10 == 5) {
                                        teteDeBoeufJoueur1 += 2;
                                    }

                                    else if (Ligne1[1] % 10 == 0) {
                                        teteDeBoeufJoueur1 += 3;
                                    }

                                    else if (Ligne1[1] % 11 == 0 && Ligne1[1] != 55) {
                                        teteDeBoeufJoueur1 += 5;
                                    }

                                    else if (Ligne1[1] == 55) {
                                        teteDeBoeufJoueur1 += 7;
                                    }
                                    else {
                                        teteDeBoeufJoueur1 += 1;
                                    }


                                    if (Ligne1[1] % 10 == 5) {
                                        teteDeBoeufJoueur1 += 2;
                                    }

                                    else if (Ligne1[2] % 10 == 0) {
                                        teteDeBoeufJoueur1 += 3;
                                    }

                                    else if (Ligne1[2] % 11 == 0 && Ligne1[2] != 55) {
                                        teteDeBoeufJoueur1 += 5;
                                    }

                                    else if (Ligne1[2] == 55) {
                                        teteDeBoeufJoueur1 += 7;
                                    }
                                    else {
                                        teteDeBoeufJoueur1 += 1;
                                    }



                                    if (Ligne1[3] % 10 == 5) {
                                        teteDeBoeufJoueur1 += 2;
                                    }

                                    else if (Ligne1[3] % 10 == 0) {
                                        teteDeBoeufJoueur1 += 3;
                                    }

                                    else if (Ligne1[3] % 11 == 0 && Ligne1[3] != 55) {
                                        teteDeBoeufJoueur1 += 5;
                                    }

                                    else if (Ligne1[3] == 55) {
                                        teteDeBoeufJoueur1 += 7;
                                    }
                                    else {
                                        teteDeBoeufJoueur1 += 1;
                                    }



                                    if (Ligne1[4] % 10 == 5) {
                                        teteDeBoeufJoueur1 += 2;
                                    }

                                    else if (Ligne1[4] % 10 == 0) {
                                        teteDeBoeufJoueur1 += 3;
                                    }

                                    else if (Ligne1[4] % 11 == 0 && Ligne1[4] != 55) {
                                        teteDeBoeufJoueur1 += 5;
                                    }

                                    else if (Ligne1[4] == 55) {
                                        teteDeBoeufJoueur1 += 7;
                                    }
                                    else {
                                        teteDeBoeufJoueur1 += 1;
                                    }


                                    Ligne1[0] = carteJouee;
                                    Ligne1[1] = 0;
                                    Ligne1[2] = 0;
                                    Ligne1[3] = 0;
                                    Ligne1[4] = 0;
                                    Ligne1[5] = 0;



                                }
                            }
                        }
                    }
                }
        }

            else if (carteJouee < Ligne1[0]) {
                System.out.println("Vous encaissez les cartes de la première ligne");
                System.out.println(carteJouee + "devient la première carte.");

                    if (Ligne1[0] % 10 == 5) {
                        teteDeBoeufJoueur1 += 2;
                    }

                    if (Ligne1[0] % 10 == 0) {
                        teteDeBoeufJoueur1 += 3;
                    }

                    if (Ligne1[0] % 11 == 0 && Ligne1[0] != 55) {
                        teteDeBoeufJoueur1 += 5;
                    }

                    if (Ligne1[0] == 55) {
                        teteDeBoeufJoueur1 += 7;
                }
                    else {
                        teteDeBoeufJoueur1 += 1;
                    }

                Ligne1[0] = carteJouee;
                Ligne1[1] = 0;
                Ligne1[2] = 0;
                Ligne1[3] = 0;
                Ligne1[4] = 0;
                Ligne1[5] = 0;

                }












        if (carteAleatoireBot1 > Ligne4[0]) {
            if (carteAleatoireBot1 > Ligne4[1] && Ligne4[1] == 0) {
                Ligne4[1] = carteAleatoireBot1;
            }
            else {
                if (carteAleatoireBot1 > Ligne4[2] && Ligne4[2] == 0) {
                    Ligne4[2] = carteAleatoireBot1;
                }
                else {
                    if (carteAleatoireBot1 > Ligne4[3] && Ligne4[3] == 0) {
                        Ligne4[3] = carteAleatoireBot1;
                    }
                    else {
                        if (carteAleatoireBot1 > Ligne4[4] && Ligne4[4] == 0) {
                            Ligne4[4] = carteAleatoireBot1;
                        }
                        else {
                            if (carteAleatoireBot1 > Ligne4[5] && Ligne4[5] == 0) {
                                Ligne4[5] = carteAleatoireBot1;

                                System.out.println("Le Bot 1 encaisse les cartes de la quatrième ligne");
                                System.out.println(carteAleatoireBot1 + "devient la première carte de la quatrième ligne.");

                                if (Ligne4[0] % 10 == 5) {
                                    teteDeBoeufBot1 += 2;
                                }

                                else if (Ligne4[0] % 10 == 0) {
                                    teteDeBoeufBot1 += 3;
                                }

                                else if (Ligne4[0] % 11 == 0 && Ligne4[0] != 55) {
                                    teteDeBoeufBot1 += 5;
                                }

                                else if (Ligne4[0] == 55) {
                                    teteDeBoeufBot1 += 7;
                                }
                                else {
                                    teteDeBoeufBot1 += 1;
                                }




                                if (Ligne4[1] % 10 == 5) {
                                    teteDeBoeufBot1 += 2;
                                }

                                else if (Ligne4[1] % 10 == 0) {
                                    teteDeBoeufBot1 += 3;
                                }

                                else if (Ligne4[1] % 11 == 0 && Ligne4[1] != 55) {
                                    teteDeBoeufBot1 += 5;
                                }

                                else if (Ligne4[1] == 55) {
                                    teteDeBoeufBot1 += 7;
                                }
                                else {
                                    teteDeBoeufBot1 += 1;
                                }


                                if (Ligne4[2] % 10 == 5) {
                                    teteDeBoeufBot1 += 2;
                                }

                                else if (Ligne4[2] % 10 == 0) {
                                    teteDeBoeufBot1 += 3;
                                }

                                else if (Ligne4[2] % 11 == 0 && Ligne4[2] != 55) {
                                    teteDeBoeufBot1 += 5;
                                }

                                else if (Ligne4[2] == 55) {
                                    teteDeBoeufBot1 += 7;
                                }
                                else {
                                    teteDeBoeufBot1 += 1;
                                }



                                if (Ligne4[3] % 10 == 5) {
                                    teteDeBoeufBot1 += 2;
                                }

                                else if (Ligne4[3] % 10 == 0) {
                                    teteDeBoeufBot1 += 3;
                                }

                                else if (Ligne4[3] % 11 == 0 && Ligne4[3] != 55) {
                                    teteDeBoeufBot1 += 5;
                                }

                                else if (Ligne4[3] == 55) {
                                    teteDeBoeufBot1 += 7;
                                }
                                else {
                                    teteDeBoeufBot1 += 1;
                                }



                                if (Ligne4[4] % 10 == 5) {
                                    teteDeBoeufBot1 += 2;
                                }

                                else if (Ligne4[4] % 10 == 0) {
                                    teteDeBoeufBot1 += 3;
                                }

                                else if (Ligne4[4] % 11 == 0 && Ligne4[4] != 55) {
                                    teteDeBoeufBot1 += 5;
                                }

                                else if (Ligne4[4] == 55) {
                                    teteDeBoeufBot1 += 7;
                                }
                                else {
                                    teteDeBoeufBot1 += 1;
                                }


                                Ligne4[0] = carteAleatoireBot1;
                                Ligne4[1] = 0;
                                Ligne4[2] = 0;
                                Ligne4[3] = 0;
                                Ligne4[4] = 0;
                                Ligne4[5] = 0;



                            }
                        }
                    }
                }
            }

        }



        else if (carteAleatoireBot1 > Ligne3[0]) {

            if (carteAleatoireBot1 > Ligne3[1] && Ligne3[1] == 0) {
                Ligne3[1] = carteAleatoireBot1;
            }
            else {
                if (carteAleatoireBot1 > Ligne3[2] && Ligne3[2] == 0) {
                    Ligne3[2] = carteAleatoireBot1;
                }
                else {
                    if (carteAleatoireBot1 > Ligne3[3] && Ligne3[3] == 0) {
                        Ligne3[3] = carteAleatoireBot1;
                    }
                    else {
                        if (carteAleatoireBot1 > Ligne3[4] && Ligne3[4] == 0) {
                            Ligne3[4] = carteAleatoireBot1;
                        }
                        else {
                            if (carteAleatoireBot1 > Ligne3[5] && Ligne3[5] == 0) {
                                Ligne3[5] = carteAleatoireBot1;

                                System.out.println("Le Bot 1 encaisse les cartes de la troisième ligne");
                                System.out.println(carteAleatoireBot1 + "devient la première carte de la troisième ligne.");

                                if (Ligne3[0] % 10 == 5) {
                                    teteDeBoeufBot1 += 2;
                                }

                                else if (Ligne3[0] % 10 == 0) {
                                    teteDeBoeufBot1 += 3;
                                }

                                else if (Ligne3[0] % 11 == 0 && Ligne3[0] != 55) {
                                    teteDeBoeufBot1 += 5;
                                }

                                else if (Ligne3[0] == 55) {
                                    teteDeBoeufBot1 += 7;
                                }
                                else {
                                    teteDeBoeufBot1 += 1;
                                }




                                if (Ligne3[1] % 10 == 5) {
                                    teteDeBoeufBot1 += 2;
                                }

                                else if (Ligne3[1] % 10 == 0) {
                                    teteDeBoeufBot1 += 3;
                                }

                                else if (Ligne3[1] % 11 == 0 && Ligne3[1] != 55) {
                                    teteDeBoeufBot1 += 5;
                                }

                                else if (Ligne3[1] == 55) {
                                    teteDeBoeufBot1 += 7;
                                }
                                else {
                                    teteDeBoeufBot1 += 1;
                                }


                                if (Ligne3[2] % 10 == 5) {
                                    teteDeBoeufBot1 += 2;
                                }

                                else if (Ligne3[2] % 10 == 0) {
                                    teteDeBoeufBot1 += 3;
                                }

                                else if (Ligne3[2] % 11 == 0 && Ligne3[2] != 55) {
                                    teteDeBoeufBot1 += 5;
                                }

                                else if (Ligne3[2] == 55) {
                                    teteDeBoeufBot1 += 7;
                                }
                                else {
                                    teteDeBoeufBot1 += 1;
                                }



                                if (Ligne3[3] % 10 == 5) {
                                    teteDeBoeufBot1 += 2;
                                }

                                else if (Ligne3[3] % 10 == 0) {
                                    teteDeBoeufBot1 += 3;
                                }

                                else if (Ligne3[3] % 11 == 0 && Ligne3[4] != 55) {
                                    teteDeBoeufBot1 += 5;
                                }

                                else if (Ligne3[3] == 55) {
                                    teteDeBoeufBot1 += 7;
                                }
                                else {
                                    teteDeBoeufBot1 += 1;
                                }



                                if (Ligne3[4] % 10 == 5) {
                                    teteDeBoeufBot1 += 2;
                                }

                                else if (Ligne3[4] % 10 == 0) {
                                    teteDeBoeufBot1 += 3;
                                }

                                else if (Ligne3[4] % 11 == 0 && Ligne3[4] != 55) {
                                    teteDeBoeufBot1 += 5;
                                }

                                else if (Ligne3[4] == 55) {
                                    teteDeBoeufBot1 += 7;
                                }
                                else {
                                    teteDeBoeufBot1 += 1;
                                }


                                Ligne3[0] = carteAleatoireBot1;
                                Ligne3[1] = 0;
                                Ligne3[2] = 0;
                                Ligne3[3] = 0;
                                Ligne3[4] = 0;
                                Ligne3[5] = 0;



                            }
                        }
                    }
                }
            }

        }

        else if (carteAleatoireBot1 > Ligne2[0]) {

            if (carteAleatoireBot1 > Ligne2[1] && Ligne2[1] == 0) {
                Ligne2[1] = carteAleatoireBot1;
            }
            else {
                if (carteAleatoireBot1 > Ligne2[2] && Ligne2[2] == 0) {
                    Ligne2[2] = carteAleatoireBot1;
                }
                else {
                    if (carteAleatoireBot1 > Ligne2[3] && Ligne2[3] == 0) {
                        Ligne2[3] = carteAleatoireBot1;
                    }
                    else {
                        if (carteAleatoireBot1 > Ligne2[4] && Ligne2[4] == 0) {
                            Ligne2[4] = carteAleatoireBot1;
                        }
                        else {
                            if (carteAleatoireBot1 > Ligne2[5] && Ligne2[5] == 0) {
                                Ligne2[5] = carteAleatoireBot1;

                                System.out.println("Le Bot 1 encaisse les cartes de la deuxième ligne");
                                System.out.println(carteAleatoireBot1 + "devient la première carte de la deuxième ligne.");

                                if (Ligne2[0] % 10 == 5) {
                                    teteDeBoeufBot1 += 2;
                                }

                                else if (Ligne2[0] % 10 == 0) {
                                    teteDeBoeufBot1 += 3;
                                }

                                else if (Ligne2[0] % 11 == 0 && Ligne2[0] != 55) {
                                    teteDeBoeufBot1 += 5;
                                }

                                else if (Ligne2[0] == 55) {
                                    teteDeBoeufBot1 += 7;
                                }
                                else {
                                    teteDeBoeufBot1 += 1;
                                }




                                if (Ligne2[1] % 10 == 5) {
                                    teteDeBoeufBot1 += 2;
                                }

                                else if (Ligne2[1] % 10 == 0) {
                                    teteDeBoeufBot1 += 3;
                                }

                                else if (Ligne2[1] % 11 == 0 && Ligne2[1] != 55) {
                                    teteDeBoeufBot1 += 5;
                                }

                                else if (Ligne2[1] == 55) {
                                    teteDeBoeufBot1 += 7;
                                }
                                else {
                                    teteDeBoeufBot1 += 1;
                                }


                                if (Ligne2[2] % 10 == 5) {
                                    teteDeBoeufBot1 += 2;
                                }

                                else if (Ligne2[2] % 10 == 0) {
                                    teteDeBoeufBot1 += 3;
                                }

                                else if (Ligne2[2] % 11 == 0 && Ligne2[2] != 55) {
                                    teteDeBoeufBot1 += 5;
                                }

                                else if (Ligne2[2] == 55) {
                                    teteDeBoeufBot1 += 7;
                                }
                                else {
                                    teteDeBoeufBot1 += 1;
                                }



                                if (Ligne2[3] % 10 == 5) {
                                    teteDeBoeufBot1 += 2;
                                }

                                else if (Ligne2[3] % 10 == 0) {
                                    teteDeBoeufBot1 += 3;
                                }

                                else if (Ligne2[3] % 11 == 0 && Ligne2[3] != 55) {
                                    teteDeBoeufBot1 += 5;
                                }

                                else if (Ligne2[3] == 55) {
                                    teteDeBoeufBot1 += 7;
                                }
                                else {
                                    teteDeBoeufBot1 += 1;
                                }



                                if (Ligne2[4] % 10 == 5) {
                                    teteDeBoeufBot1 += 2;
                                }

                                else if (Ligne2[4] % 10 == 0) {
                                    teteDeBoeufBot1 += 3;
                                }

                                else if (Ligne2[4] % 11 == 0 && Ligne2[4] != 55) {
                                    teteDeBoeufBot1 += 5;
                                }

                                else if (Ligne2[4] == 55) {
                                    teteDeBoeufBot1 += 7;
                                }
                                else {
                                    teteDeBoeufBot1 += 1;
                                }


                                Ligne2[0] = carteAleatoireBot1;
                                Ligne2[1] = 0;
                                Ligne2[2] = 0;
                                Ligne2[3] = 0;
                                Ligne2[4] = 0;
                                Ligne2[5] = 0;



                            }
                        }
                    }
                }
            }
        }


        else if (carteAleatoireBot1 > Ligne1[0]) {
            if (carteAleatoireBot1 > Ligne1[1] && Ligne1[1] == 0) {
                Ligne1[1] = carteAleatoireBot1;
            }
            else {
                if (carteAleatoireBot1 > Ligne1[2] && Ligne1[2] == 0) {
                    Ligne1[2] = carteAleatoireBot1;
                }
                else {
                    if (carteAleatoireBot1 > Ligne1[3] && Ligne1[3] == 0) {
                        Ligne1[3] = carteAleatoireBot1;
                    }
                    else {
                        if (carteAleatoireBot1 > Ligne1[4] && Ligne1[4] == 0) {
                            Ligne1[4] = carteAleatoireBot1;
                        }
                        else {
                            if (carteAleatoireBot1 > Ligne1[5] && Ligne1[5] == 0) {
                                Ligne1[5] = carteAleatoireBot1;

                                System.out.println("Le Bot 1 encaisse les cartes de la première ligne");
                                System.out.println(carteAleatoireBot1 + "devient la première carte de la première ligne.");

                                if (Ligne1[0] % 10 == 5) {
                                    teteDeBoeufBot1 += 2;
                                }

                                else if (Ligne1[0] % 10 == 0) {
                                    teteDeBoeufBot1 += 3;
                                }

                                else if (Ligne1[0] % 11 == 0 && Ligne1[0] != 55) {
                                    teteDeBoeufBot1 += 5;
                                }

                                else if (Ligne1[0] == 55) {
                                    teteDeBoeufBot1 += 7;
                                }
                                else {
                                    teteDeBoeufBot1 += 1;
                                }




                                if (Ligne1[1] % 10 == 5) {
                                    teteDeBoeufBot1 += 2;
                                }

                                else if (Ligne1[1] % 10 == 0) {
                                    teteDeBoeufBot1 += 3;
                                }

                                else if (Ligne1[1] % 11 == 0 && Ligne1[1] != 55) {
                                    teteDeBoeufBot1 += 5;
                                }

                                else if (Ligne1[1] == 55) {
                                    teteDeBoeufBot1 += 7;
                                }
                                else {
                                    teteDeBoeufBot1 += 1;
                                }


                                if (Ligne1[1] % 10 == 5) {
                                    teteDeBoeufBot1 += 2;
                                }

                                else if (Ligne1[2] % 10 == 0) {
                                    teteDeBoeufBot1 += 3;
                                }

                                else if (Ligne1[2] % 11 == 0 && Ligne1[2] != 55) {
                                    teteDeBoeufBot1 += 5;
                                }

                                else if (Ligne1[2] == 55) {
                                    teteDeBoeufBot1 += 7;
                                }
                                else {
                                    teteDeBoeufBot1 += 1;
                                }



                                if (Ligne1[3] % 10 == 5) {
                                    teteDeBoeufBot1 += 2;
                                }

                                else if (Ligne1[3] % 10 == 0) {
                                    teteDeBoeufBot1 += 3;
                                }

                                else if (Ligne1[3] % 11 == 0 && Ligne1[3] != 55) {
                                    teteDeBoeufBot1 += 5;
                                }

                                else if (Ligne1[3] == 55) {
                                    teteDeBoeufBot1 += 7;
                                }
                                else {
                                    teteDeBoeufBot1 += 1;
                                }



                                if (Ligne1[4] % 10 == 5) {
                                    teteDeBoeufBot1 += 2;
                                }

                                else if (Ligne1[4] % 10 == 0) {
                                    teteDeBoeufBot1 += 3;
                                }

                                else if (Ligne1[4] % 11 == 0 && Ligne1[4] != 55) {
                                    teteDeBoeufBot1 += 5;
                                }

                                else if (Ligne1[4] == 55) {
                                    teteDeBoeufBot1 += 7;
                                }
                                else {
                                    teteDeBoeufBot1 += 1;
                                }


                                Ligne1[0] = carteAleatoireBot1;
                                Ligne1[1] = 0;
                                Ligne1[2] = 0;
                                Ligne1[3] = 0;
                                Ligne1[4] = 0;
                                Ligne1[5] = 0;



                            }
                        }
                    }
                }
            }
        }


        else if (carteAleatoireBot1 < Ligne1[0]) {
            System.out.println("Le Bot 1 encaisse les cartes de la première ligne");
            System.out.println(carteAleatoireBot1 + "devient la première carte.");

            if (Ligne1[0] % 10 == 5) {
                teteDeBoeufBot1 += 2;
            }

            if (Ligne1[0] % 10 == 0) {
                teteDeBoeufBot1 += 3;
            }

            if (Ligne1[0] % 11 == 0 && Ligne1[0] != 55) {
                teteDeBoeufBot1 += 5;
            }

            if (Ligne1[0] == 55) {
                teteDeBoeufBot1 += 7;
            }
            else {
                teteDeBoeufBot1 += 1;
            }

            Ligne1[0] = carteAleatoireBot1;

        }

















        if (carteAleatoireBot2 > Ligne4[0]) {
            if (carteAleatoireBot2 > Ligne4[1] && Ligne4[1] == 0) {
                Ligne4[1] = carteAleatoireBot2;
            }
            else {
                if (carteAleatoireBot2 > Ligne4[2] && Ligne4[2] == 0) {
                    Ligne4[2] = carteAleatoireBot2;
                }
                else {
                    if (carteAleatoireBot2 > Ligne4[3] && Ligne4[3] == 0) {
                        Ligne4[3] = carteAleatoireBot2;
                    }
                    else {
                        if (carteAleatoireBot2 > Ligne4[4] && Ligne4[4] == 0) {
                            Ligne4[4] = carteAleatoireBot2;
                        }
                        else {
                            if (carteAleatoireBot2 > Ligne4[5] && Ligne4[5] == 0) {
                                Ligne4[5] = carteAleatoireBot2;

                                System.out.println("Le Bot 2 encaisse les cartes de la quatrième ligne");
                                System.out.println(carteAleatoireBot2 + "devient la première carte de la quatrième ligne.");

                                if (Ligne4[0] % 10 == 5) {
                                    teteDeBoeufBot2 += 2;
                                }

                                else if (Ligne4[0] % 10 == 0) {
                                    teteDeBoeufBot2 += 3;
                                }

                                else if (Ligne4[0] % 11 == 0 && Ligne4[0] != 55) {
                                    teteDeBoeufBot2 += 5;
                                }

                                else if (Ligne4[0] == 55) {
                                    teteDeBoeufBot2 += 7;
                                }
                                else {
                                    teteDeBoeufBot2 += 1;
                                }




                                if (Ligne4[1] % 10 == 5) {
                                    teteDeBoeufBot2 += 2;
                                }

                                else if (Ligne4[1] % 10 == 0) {
                                    teteDeBoeufBot2 += 3;
                                }

                                else if (Ligne4[1] % 11 == 0 && Ligne4[1] != 55) {
                                    teteDeBoeufBot2 += 5;
                                }

                                else if (Ligne4[1] == 55) {
                                    teteDeBoeufBot2 += 7;
                                }
                                else {
                                    teteDeBoeufBot2 += 1;
                                }


                                if (Ligne4[2] % 10 == 5) {
                                    teteDeBoeufBot2 += 2;
                                }

                                else if (Ligne4[2] % 10 == 0) {
                                    teteDeBoeufBot2 += 3;
                                }

                                else if (Ligne4[2] % 11 == 0 && Ligne4[2] != 55) {
                                    teteDeBoeufBot2 += 5;
                                }

                                else if (Ligne4[2] == 55) {
                                    teteDeBoeufBot2 += 7;
                                }
                                else {
                                    teteDeBoeufBot2 += 1;
                                }



                                if (Ligne4[3] % 10 == 5) {
                                    teteDeBoeufBot2 += 2;
                                }

                                else if (Ligne4[3] % 10 == 0) {
                                    teteDeBoeufBot2 += 3;
                                }

                                else if (Ligne4[3] % 11 == 0 && Ligne4[3] != 55) {
                                    teteDeBoeufBot2 += 5;
                                }

                                else if (Ligne4[3] == 55) {
                                    teteDeBoeufBot2 += 7;
                                }
                                else {
                                    teteDeBoeufBot2 += 1;
                                }



                                if (Ligne4[4] % 10 == 5) {
                                    teteDeBoeufBot2 += 2;
                                }

                                else if (Ligne4[4] % 10 == 0) {
                                    teteDeBoeufBot2 += 3;
                                }

                                else if (Ligne4[4] % 11 == 0 && Ligne4[4] != 55) {
                                    teteDeBoeufBot2 += 5;
                                }

                                else if (Ligne4[4] == 55) {
                                    teteDeBoeufBot2 += 7;
                                }
                                else {
                                    teteDeBoeufBot2 += 1;
                                }


                                Ligne4[0] = carteAleatoireBot2;
                                Ligne4[1] = 0;
                                Ligne4[2] = 0;
                                Ligne4[3] = 0;
                                Ligne4[4] = 0;
                                Ligne4[5] = 0;



                            }
                        }
                    }
                }
            }

        }



        else if (carteAleatoireBot2 > Ligne3[0]) {

            if (carteAleatoireBot2 > Ligne3[1] && Ligne3[1] == 0) {
                Ligne3[1] = carteAleatoireBot2;
            }
            else {
                if (carteAleatoireBot2 > Ligne3[2] && Ligne3[2] == 0) {
                    Ligne3[2] = carteAleatoireBot2;
                }
                else {
                    if (carteAleatoireBot2 > Ligne3[3] && Ligne3[3] == 0) {
                        Ligne3[3] = carteAleatoireBot2;
                    }
                    else {
                        if (carteAleatoireBot2 > Ligne3[4] && Ligne3[4] == 0) {
                            Ligne3[4] = carteAleatoireBot2;
                        }
                        else {
                            if (carteAleatoireBot2 > Ligne3[5] && Ligne3[5] == 0) {
                                Ligne3[5] = carteAleatoireBot2;

                                System.out.println("Le Bot 2 encaisse les cartes de la troisième ligne");
                                System.out.println(carteAleatoireBot2 + "devient la première carte de la troisième ligne.");

                                if (Ligne3[0] % 10 == 5) {
                                    teteDeBoeufBot2 += 2;
                                }

                                else if (Ligne3[0] % 10 == 0) {
                                    teteDeBoeufBot2 += 3;
                                }

                                else if (Ligne3[0] % 11 == 0 && Ligne3[0] != 55) {
                                    teteDeBoeufBot2 += 5;
                                }

                                else if (Ligne3[0] == 55) {
                                    teteDeBoeufBot2 += 7;
                                }
                                else {
                                    teteDeBoeufBot2 += 1;
                                }




                                if (Ligne3[1] % 10 == 5) {
                                    teteDeBoeufBot2 += 2;
                                }

                                else if (Ligne3[1] % 10 == 0) {
                                    teteDeBoeufBot2 += 3;
                                }

                                else if (Ligne3[1] % 11 == 0 && Ligne3[1] != 55) {
                                    teteDeBoeufBot2 += 5;
                                }

                                else if (Ligne3[1] == 55) {
                                    teteDeBoeufBot2 += 7;
                                }
                                else {
                                    teteDeBoeufBot2 += 1;
                                }


                                if (Ligne3[2] % 10 == 5) {
                                    teteDeBoeufBot2 += 2;
                                }

                                else if (Ligne3[2] % 10 == 0) {
                                    teteDeBoeufBot2 += 3;
                                }

                                else if (Ligne3[2] % 11 == 0 && Ligne3[2] != 55) {
                                    teteDeBoeufBot2 += 5;
                                }

                                else if (Ligne3[2] == 55) {
                                    teteDeBoeufBot2 += 7;
                                }
                                else {
                                    teteDeBoeufBot2 += 1;
                                }



                                if (Ligne3[3] % 10 == 5) {
                                    teteDeBoeufBot2 += 2;
                                }

                                else if (Ligne3[3] % 10 == 0) {
                                    teteDeBoeufBot2 += 3;
                                }

                                else if (Ligne3[3] % 11 == 0 && Ligne3[4] != 55) {
                                    teteDeBoeufBot2 += 5;
                                }

                                else if (Ligne3[3] == 55) {
                                    teteDeBoeufBot2 += 7;
                                }
                                else {
                                    teteDeBoeufBot2 += 1;
                                }



                                if (Ligne3[4] % 10 == 5) {
                                    teteDeBoeufBot2 += 2;
                                }

                                else if (Ligne3[4] % 10 == 0) {
                                    teteDeBoeufBot2 += 3;
                                }

                                else if (Ligne3[4] % 11 == 0 && Ligne3[4] != 55) {
                                    teteDeBoeufBot2 += 5;
                                }

                                else if (Ligne3[4] == 55) {
                                    teteDeBoeufBot2 += 7;
                                }
                                else {
                                    teteDeBoeufBot2 += 1;
                                }


                                Ligne3[0] = carteAleatoireBot2;
                                Ligne3[1] = 0;
                                Ligne3[2] = 0;
                                Ligne3[3] = 0;
                                Ligne3[4] = 0;
                                Ligne3[5] = 0;



                            }
                        }
                    }
                }
            }

        }

        else if (carteAleatoireBot2 > Ligne2[0]) {

            if (carteAleatoireBot2 > Ligne2[1] && Ligne2[1] == 0) {
                Ligne2[1] = carteAleatoireBot2;
            }
            else {
                if (carteAleatoireBot2 > Ligne2[2] && Ligne2[2] == 0) {
                    Ligne2[2] = carteAleatoireBot2;
                }
                else {
                    if (carteAleatoireBot2 > Ligne2[3] && Ligne2[3] == 0) {
                        Ligne2[3] = carteAleatoireBot2;
                    }
                    else {
                        if (carteAleatoireBot2 > Ligne2[4] && Ligne2[4] == 0) {
                            Ligne2[4] = carteAleatoireBot2;
                        }
                        else {
                            if (carteAleatoireBot2 > Ligne2[5] && Ligne2[5] == 0) {
                                Ligne2[5] = carteAleatoireBot2;

                                System.out.println("Le Bot 2 encaisse les cartes de la deuxième ligne");
                                System.out.println(carteAleatoireBot2 + "devient la première carte de la deuxième ligne.");

                                if (Ligne2[0] % 10 == 5) {
                                    teteDeBoeufBot2 += 2;
                                }

                                else if (Ligne2[0] % 10 == 0) {
                                    teteDeBoeufBot2 += 3;
                                }

                                else if (Ligne2[0] % 11 == 0 && Ligne2[0] != 55) {
                                    teteDeBoeufBot2 += 5;
                                }

                                else if (Ligne2[0] == 55) {
                                    teteDeBoeufBot2 += 7;
                                }
                                else {
                                    teteDeBoeufBot2 += 1;
                                }




                                if (Ligne2[1] % 10 == 5) {
                                    teteDeBoeufBot2 += 2;
                                }

                                else if (Ligne2[1] % 10 == 0) {
                                    teteDeBoeufBot2 += 3;
                                }

                                else if (Ligne2[1] % 11 == 0 && Ligne2[1] != 55) {
                                    teteDeBoeufBot2 += 5;
                                }

                                else if (Ligne2[1] == 55) {
                                    teteDeBoeufBot2 += 7;
                                }
                                else {
                                    teteDeBoeufBot2 += 1;
                                }


                                if (Ligne2[2] % 10 == 5) {
                                    teteDeBoeufBot2 += 2;
                                }

                                else if (Ligne2[2] % 10 == 0) {
                                    teteDeBoeufBot2 += 3;
                                }

                                else if (Ligne2[2] % 11 == 0 && Ligne2[2] != 55) {
                                    teteDeBoeufBot2 += 5;
                                }

                                else if (Ligne2[2] == 55) {
                                    teteDeBoeufBot2 += 7;
                                }
                                else {
                                    teteDeBoeufBot2 += 1;
                                }



                                if (Ligne2[3] % 10 == 5) {
                                    teteDeBoeufBot2 += 2;
                                }

                                else if (Ligne2[3] % 10 == 0) {
                                    teteDeBoeufBot2 += 3;
                                }

                                else if (Ligne2[3] % 11 == 0 && Ligne2[3] != 55) {
                                    teteDeBoeufBot2 += 5;
                                }

                                else if (Ligne2[3] == 55) {
                                    teteDeBoeufBot2 += 7;
                                }
                                else {
                                    teteDeBoeufBot2 += 1;
                                }



                                if (Ligne2[4] % 10 == 5) {
                                    teteDeBoeufBot2 += 2;
                                }

                                else if (Ligne2[4] % 10 == 0) {
                                    teteDeBoeufBot2 += 3;
                                }

                                else if (Ligne2[4] % 11 == 0 && Ligne2[4] != 55) {
                                    teteDeBoeufBot2 += 5;
                                }

                                else if (Ligne2[4] == 55) {
                                    teteDeBoeufBot2 += 7;
                                }
                                else {
                                    teteDeBoeufBot2 += 1;
                                }


                                Ligne2[0] = carteAleatoireBot2;
                                Ligne2[1] = 0;
                                Ligne2[2] = 0;
                                Ligne2[3] = 0;
                                Ligne2[4] = 0;
                                Ligne2[5] = 0;



                            }
                        }
                    }
                }
            }
        }


        else if (carteAleatoireBot2 > Ligne1[0]) {
            if (carteAleatoireBot2 > Ligne1[1] && Ligne1[1] == 0) {
                Ligne1[1] = carteAleatoireBot2;
            }
            else {
                if (carteAleatoireBot2 > Ligne1[2] && Ligne1[2] == 0) {
                    Ligne1[2] = carteAleatoireBot2;
                }
                else {
                    if (carteAleatoireBot2 > Ligne1[3] && Ligne1[3] == 0) {
                        Ligne1[3] = carteAleatoireBot2;
                    }
                    else {
                        if (carteAleatoireBot2 > Ligne1[4] && Ligne1[4] == 0) {
                            Ligne1[4] = carteAleatoireBot2;
                        }
                        else {
                            if (carteAleatoireBot2 > Ligne1[5] && Ligne1[5] == 0) {
                                Ligne1[5] = carteAleatoireBot2;

                                System.out.println("Le Bot 2 encaisse les cartes de la première ligne");
                                System.out.println(carteAleatoireBot2 + "devient la première carte de la première ligne.");

                                if (Ligne1[0] % 10 == 5) {
                                    teteDeBoeufBot2 += 2;
                                }

                                else if (Ligne1[0] % 10 == 0) {
                                    teteDeBoeufBot2 += 3;
                                }

                                else if (Ligne1[0] % 11 == 0 && Ligne1[0] != 55) {
                                    teteDeBoeufBot2 += 5;
                                }

                                else if (Ligne1[0] == 55) {
                                    teteDeBoeufBot2 += 7;
                                }
                                else {
                                    teteDeBoeufBot2 += 1;
                                }




                                if (Ligne1[1] % 10 == 5) {
                                    teteDeBoeufBot2 += 2;
                                }

                                else if (Ligne1[1] % 10 == 0) {
                                    teteDeBoeufBot2 += 3;
                                }

                                else if (Ligne1[1] % 11 == 0 && Ligne1[1] != 55) {
                                    teteDeBoeufBot2 += 5;
                                }

                                else if (Ligne1[1] == 55) {
                                    teteDeBoeufBot2 += 7;
                                }
                                else {
                                    teteDeBoeufBot2 += 1;
                                }


                                if (Ligne1[1] % 10 == 5) {
                                    teteDeBoeufBot2 += 2;
                                }

                                else if (Ligne1[2] % 10 == 0) {
                                    teteDeBoeufBot2 += 3;
                                }

                                else if (Ligne1[2] % 11 == 0 && Ligne1[2] != 55) {
                                    teteDeBoeufBot2 += 5;
                                }

                                else if (Ligne1[2] == 55) {
                                    teteDeBoeufBot2 += 7;
                                }
                                else {
                                    teteDeBoeufBot2 += 1;
                                }



                                if (Ligne1[3] % 10 == 5) {
                                    teteDeBoeufBot2 += 2;
                                }

                                else if (Ligne1[3] % 10 == 0) {
                                    teteDeBoeufBot2 += 3;
                                }

                                else if (Ligne1[3] % 11 == 0 && Ligne1[3] != 55) {
                                    teteDeBoeufBot2 += 5;
                                }

                                else if (Ligne1[3] == 55) {
                                    teteDeBoeufBot2 += 7;
                                }
                                else {
                                    teteDeBoeufBot2 += 1;
                                }



                                if (Ligne1[4] % 10 == 5) {
                                    teteDeBoeufBot2 += 2;
                                }

                                else if (Ligne1[4] % 10 == 0) {
                                    teteDeBoeufBot2 += 3;
                                }

                                else if (Ligne1[4] % 11 == 0 && Ligne1[4] != 55) {
                                    teteDeBoeufBot2 += 5;
                                }

                                else if (Ligne1[4] == 55) {
                                    teteDeBoeufBot2 += 7;
                                }
                                else {
                                    teteDeBoeufBot2 += 1;
                                }


                                Ligne1[0] = carteAleatoireBot2;
                                Ligne1[1] = 0;
                                Ligne1[2] = 0;
                                Ligne1[3] = 0;
                                Ligne1[4] = 0;
                                Ligne1[5] = 0;



                            }
                        }
                    }
                }
            }
        }


        else if (carteAleatoireBot2 < Ligne1[0]) {
            System.out.println("Le Bot 2 encaisse les cartes de la première ligne");
            System.out.println(carteAleatoireBot2 + "devient la première carte.");

            if (Ligne1[0] % 10 == 5) {
                teteDeBoeufBot2 += 2;
            }

            if (Ligne1[0] % 10 == 0) {
                teteDeBoeufBot2 += 3;
            }

            if (Ligne1[0] % 11 == 0 && Ligne1[0] != 55) {
                teteDeBoeufBot2 += 5;
            }

            if (Ligne1[0] == 55) {
                teteDeBoeufBot2 += 7;
            }
            else {
                teteDeBoeufBot2 += 1;
            }

            Ligne1[0] = carteAleatoireBot2;
            Ligne1[1] = 0;
            Ligne1[2] = 0;
            Ligne1[3] = 0;
            Ligne1[4] = 0;
            Ligne1[5] = 0;

        }















        if (carteAleatoireBot3 > Ligne4[0]) {
            if (carteAleatoireBot3 > Ligne4[1] && Ligne4[1] == 0) {
                Ligne4[1] = carteAleatoireBot3;
            }
            else {
                if (carteAleatoireBot3 > Ligne4[2] && Ligne4[2] == 0) {
                    Ligne4[2] = carteAleatoireBot3;
                }
                else {
                    if (carteAleatoireBot3 > Ligne4[3] && Ligne4[3] == 0) {
                        Ligne4[3] = carteAleatoireBot3;
                    }
                    else {
                        if (carteAleatoireBot3 > Ligne4[4] && Ligne4[4] == 0) {
                            Ligne4[4] = carteAleatoireBot3;
                        }
                        else {
                            if (carteAleatoireBot3 > Ligne4[5] && Ligne4[5] == 0) {
                                Ligne4[5] = carteAleatoireBot3;

                                System.out.println("Le Bot 3 encaisse les cartes de la quatrième ligne");
                                System.out.println(carteAleatoireBot3 + "devient la première carte de la quatrième ligne.");

                                if (Ligne4[0] % 10 == 5) {
                                    teteDeBoeufBot3 += 2;
                                }

                                else if (Ligne4[0] % 10 == 0) {
                                    teteDeBoeufBot3 += 3;
                                }

                                else if (Ligne4[0] % 11 == 0 && Ligne4[0] != 55) {
                                    teteDeBoeufBot3 += 5;
                                }

                                else if (Ligne4[0] == 55) {
                                    teteDeBoeufBot3 += 7;
                                }
                                else {
                                    teteDeBoeufBot3 += 1;
                                }




                                if (Ligne4[1] % 10 == 5) {
                                    teteDeBoeufBot3 += 2;
                                }

                                else if (Ligne4[1] % 10 == 0) {
                                    teteDeBoeufBot3 += 3;
                                }

                                else if (Ligne4[1] % 11 == 0 && Ligne4[1] != 55) {
                                    teteDeBoeufBot3 += 5;
                                }

                                else if (Ligne4[1] == 55) {
                                    teteDeBoeufBot3 += 7;
                                }
                                else {
                                    teteDeBoeufBot3 += 1;
                                }


                                if (Ligne4[2] % 10 == 5) {
                                    teteDeBoeufBot3 += 2;
                                }

                                else if (Ligne4[2] % 10 == 0) {
                                    teteDeBoeufBot3 += 3;
                                }

                                else if (Ligne4[2] % 11 == 0 && Ligne4[2] != 55) {
                                    teteDeBoeufBot3 += 5;
                                }

                                else if (Ligne4[2] == 55) {
                                    teteDeBoeufBot3 += 7;
                                }
                                else {
                                    teteDeBoeufBot3 += 1;
                                }



                                if (Ligne4[3] % 10 == 5) {
                                    teteDeBoeufBot3 += 2;
                                }

                                else if (Ligne4[3] % 10 == 0) {
                                    teteDeBoeufBot3 += 3;
                                }

                                else if (Ligne4[3] % 11 == 0 && Ligne4[3] != 55) {
                                    teteDeBoeufBot3 += 5;
                                }

                                else if (Ligne4[3] == 55) {
                                    teteDeBoeufBot3 += 7;
                                }
                                else {
                                    teteDeBoeufBot3 += 1;
                                }



                                if (Ligne4[4] % 10 == 5) {
                                    teteDeBoeufBot3 += 2;
                                }

                                else if (Ligne4[4] % 10 == 0) {
                                    teteDeBoeufBot3 += 3;
                                }

                                else if (Ligne4[4] % 11 == 0 && Ligne4[4] != 55) {
                                    teteDeBoeufBot3 += 5;
                                }

                                else if (Ligne4[4] == 55) {
                                    teteDeBoeufBot3 += 7;
                                }
                                else {
                                    teteDeBoeufBot3 += 1;
                                }


                                Ligne4[0] = carteAleatoireBot3;
                                Ligne4[1] = 0;
                                Ligne4[2] = 0;
                                Ligne4[3] = 0;
                                Ligne4[4] = 0;
                                Ligne4[5] = 0;



                            }
                        }
                    }
                }
            }

        }



        else if (carteAleatoireBot3 > Ligne3[0]) {

            if (carteAleatoireBot3 > Ligne3[1] && Ligne3[1] == 0) {
                Ligne3[1] = carteAleatoireBot3;
            }
            else {
                if (carteAleatoireBot3 > Ligne3[2] && Ligne3[2] == 0) {
                    Ligne3[2] = carteAleatoireBot3;
                }
                else {
                    if (carteAleatoireBot3 > Ligne3[3] && Ligne3[3] == 0) {
                        Ligne3[3] = carteAleatoireBot3;
                    }
                    else {
                        if (carteAleatoireBot3 > Ligne3[4] && Ligne3[4] == 0) {
                            Ligne3[4] = carteAleatoireBot3;
                        }
                        else {
                            if (carteAleatoireBot3 > Ligne3[5] && Ligne3[5] == 0) {
                                Ligne3[5] = carteAleatoireBot3;

                                System.out.println("Le Bot 3 encaisse les cartes de la troisième ligne");
                                System.out.println(carteAleatoireBot3 + "devient la première carte de la troisième ligne.");

                                if (Ligne3[0] % 10 == 5) {
                                    teteDeBoeufBot3 += 2;
                                }

                                else if (Ligne3[0] % 10 == 0) {
                                    teteDeBoeufBot3 += 3;
                                }

                                else if (Ligne3[0] % 11 == 0 && Ligne3[0] != 55) {
                                    teteDeBoeufBot3 += 5;
                                }

                                else if (Ligne3[0] == 55) {
                                    teteDeBoeufBot3 += 7;
                                }
                                else {
                                    teteDeBoeufBot3 += 1;
                                }




                                if (Ligne3[1] % 10 == 5) {
                                    teteDeBoeufBot3 += 2;
                                }

                                else if (Ligne3[1] % 10 == 0) {
                                    teteDeBoeufBot3 += 3;
                                }

                                else if (Ligne3[1] % 11 == 0 && Ligne3[1] != 55) {
                                    teteDeBoeufBot3 += 5;
                                }

                                else if (Ligne3[1] == 55) {
                                    teteDeBoeufBot3 += 7;
                                }
                                else {
                                    teteDeBoeufBot3 += 1;
                                }


                                if (Ligne3[2] % 10 == 5) {
                                    teteDeBoeufBot3 += 2;
                                }

                                else if (Ligne3[2] % 10 == 0) {
                                    teteDeBoeufBot3 += 3;
                                }

                                else if (Ligne3[2] % 11 == 0 && Ligne3[2] != 55) {
                                    teteDeBoeufBot3 += 5;
                                }

                                else if (Ligne3[2] == 55) {
                                    teteDeBoeufBot3 += 7;
                                }
                                else {
                                    teteDeBoeufBot3 += 1;
                                }



                                if (Ligne3[3] % 10 == 5) {
                                    teteDeBoeufBot3 += 2;
                                }

                                else if (Ligne3[3] % 10 == 0) {
                                    teteDeBoeufBot3 += 3;
                                }

                                else if (Ligne3[3] % 11 == 0 && Ligne3[4] != 55) {
                                    teteDeBoeufBot3 += 5;
                                }

                                else if (Ligne3[3] == 55) {
                                    teteDeBoeufBot3 += 7;
                                }
                                else {
                                    teteDeBoeufBot3 += 1;
                                }



                                if (Ligne3[4] % 10 == 5) {
                                    teteDeBoeufBot3 += 2;
                                }

                                else if (Ligne3[4] % 10 == 0) {
                                    teteDeBoeufBot3 += 3;
                                }

                                else if (Ligne3[4] % 11 == 0 && Ligne3[4] != 55) {
                                    teteDeBoeufBot3 += 5;
                                }

                                else if (Ligne3[4] == 55) {
                                    teteDeBoeufBot3 += 7;
                                }
                                else {
                                    teteDeBoeufBot3 += 1;
                                }


                                Ligne3[0] = carteAleatoireBot3;
                                Ligne3[1] = 0;
                                Ligne3[2] = 0;
                                Ligne3[3] = 0;
                                Ligne3[4] = 0;
                                Ligne3[5] = 0;



                            }
                        }
                    }
                }
            }

        }

        else if (carteAleatoireBot3 > Ligne2[0]) {

            if (carteAleatoireBot3 > Ligne2[1] && Ligne2[1] == 0) {
                Ligne2[1] = carteAleatoireBot3;
            }
            else {
                if (carteAleatoireBot3 > Ligne2[2] && Ligne2[2] == 0) {
                    Ligne2[2] = carteAleatoireBot3;
                }
                else {
                    if (carteAleatoireBot3 > Ligne2[3] && Ligne2[3] == 0) {
                        Ligne2[3] = carteAleatoireBot3;
                    }
                    else {
                        if (carteAleatoireBot3 > Ligne2[4] && Ligne2[4] == 0) {
                            Ligne2[4] = carteAleatoireBot3;
                        }
                        else {
                            if (carteAleatoireBot3 > Ligne2[5] && Ligne2[5] == 0) {
                                Ligne2[5] = carteAleatoireBot3;

                                System.out.println("Le Bot 3 encaisse les cartes de la deuxième ligne");
                                System.out.println(carteAleatoireBot3 + "devient la première carte de la deuxième ligne.");

                                if (Ligne2[0] % 10 == 5) {
                                    teteDeBoeufBot3 += 2;
                                }

                                else if (Ligne2[0] % 10 == 0) {
                                    teteDeBoeufBot3 += 3;
                                }

                                else if (Ligne2[0] % 11 == 0 && Ligne2[0] != 55) {
                                    teteDeBoeufBot3 += 5;
                                }

                                else if (Ligne2[0] == 55) {
                                    teteDeBoeufBot3 += 7;
                                }
                                else {
                                    teteDeBoeufBot3 += 1;
                                }




                                if (Ligne2[1] % 10 == 5) {
                                    teteDeBoeufBot3 += 2;
                                }

                                else if (Ligne2[1] % 10 == 0) {
                                    teteDeBoeufBot3 += 3;
                                }

                                else if (Ligne2[1] % 11 == 0 && Ligne2[1] != 55) {
                                    teteDeBoeufBot3 += 5;
                                }

                                else if (Ligne2[1] == 55) {
                                    teteDeBoeufBot3 += 7;
                                }
                                else {
                                    teteDeBoeufBot3 += 1;
                                }


                                if (Ligne2[2] % 10 == 5) {
                                    teteDeBoeufBot3 += 2;
                                }

                                else if (Ligne2[2] % 10 == 0) {
                                    teteDeBoeufBot3 += 3;
                                }

                                else if (Ligne2[2] % 11 == 0 && Ligne2[2] != 55) {
                                    teteDeBoeufBot3 += 5;
                                }

                                else if (Ligne2[2] == 55) {
                                    teteDeBoeufBot3 += 7;
                                }
                                else {
                                    teteDeBoeufBot3 += 1;
                                }



                                if (Ligne2[3] % 10 == 5) {
                                    teteDeBoeufBot3 += 2;
                                }

                                else if (Ligne2[3] % 10 == 0) {
                                    teteDeBoeufBot3 += 3;
                                }

                                else if (Ligne2[3] % 11 == 0 && Ligne2[3] != 55) {
                                    teteDeBoeufBot3 += 5;
                                }

                                else if (Ligne2[3] == 55) {
                                    teteDeBoeufBot3 += 7;
                                }
                                else {
                                    teteDeBoeufBot3 += 1;
                                }



                                if (Ligne2[4] % 10 == 5) {
                                    teteDeBoeufBot3 += 2;
                                }

                                else if (Ligne2[4] % 10 == 0) {
                                    teteDeBoeufBot3 += 3;
                                }

                                else if (Ligne2[4] % 11 == 0 && Ligne2[4] != 55) {
                                    teteDeBoeufBot3 += 5;
                                }

                                else if (Ligne2[4] == 55) {
                                    teteDeBoeufBot3 += 7;
                                }
                                else {
                                    teteDeBoeufBot3 += 1;
                                }


                                Ligne2[0] = carteAleatoireBot3;
                                Ligne2[1] = 0;
                                Ligne2[2] = 0;
                                Ligne2[3] = 0;
                                Ligne2[4] = 0;
                                Ligne2[5] = 0;



                            }
                        }
                    }
                }
            }
        }


        else if (carteAleatoireBot3 > Ligne1[0]) {
            if (carteAleatoireBot3 > Ligne1[1] && Ligne1[1] == 0) {
                Ligne1[1] = carteAleatoireBot3;
            }
            else {
                if (carteAleatoireBot3 > Ligne1[2] && Ligne1[2] == 0) {
                    Ligne1[2] = carteAleatoireBot3;
                }
                else {
                    if (carteAleatoireBot3 > Ligne1[3] && Ligne1[3] == 0) {
                        Ligne1[3] = carteAleatoireBot3;
                    }
                    else {
                        if (carteAleatoireBot3 > Ligne1[4] && Ligne1[4] == 0) {
                            Ligne1[4] = carteAleatoireBot3;
                        }
                        else {
                            if (carteAleatoireBot3 > Ligne1[5] && Ligne1[5] == 0) {
                                Ligne1[5] = carteAleatoireBot3;

                                System.out.println("Le Bot 3 encaisse les cartes de la première ligne");
                                System.out.println(carteAleatoireBot3 + "devient la première carte de la première ligne.");

                                if (Ligne1[0] % 10 == 5) {
                                    teteDeBoeufBot3 += 2;
                                }

                                else if (Ligne1[0] % 10 == 0) {
                                    teteDeBoeufBot3 += 3;
                                }

                                else if (Ligne1[0] % 11 == 0 && Ligne1[0] != 55) {
                                    teteDeBoeufBot3 += 5;
                                }

                                else if (Ligne1[0] == 55) {
                                    teteDeBoeufBot3 += 7;
                                }
                                else {
                                    teteDeBoeufBot3 += 1;
                                }




                                if (Ligne1[1] % 10 == 5) {
                                    teteDeBoeufBot3 += 2;
                                }

                                else if (Ligne1[1] % 10 == 0) {
                                    teteDeBoeufBot3 += 3;
                                }

                                else if (Ligne1[1] % 11 == 0 && Ligne1[1] != 55) {
                                    teteDeBoeufBot3 += 5;
                                }

                                else if (Ligne1[1] == 55) {
                                    teteDeBoeufBot3 += 7;
                                }
                                else {
                                    teteDeBoeufBot3 += 1;
                                }


                                if (Ligne1[1] % 10 == 5) {
                                    teteDeBoeufBot3 += 2;
                                }

                                else if (Ligne1[2] % 10 == 0) {
                                    teteDeBoeufBot3 += 3;
                                }

                                else if (Ligne1[2] % 11 == 0 && Ligne1[2] != 55) {
                                    teteDeBoeufBot3 += 5;
                                }

                                else if (Ligne1[2] == 55) {
                                    teteDeBoeufBot3 += 7;
                                }
                                else {
                                    teteDeBoeufBot3 += 1;
                                }



                                if (Ligne1[3] % 10 == 5) {
                                    teteDeBoeufBot3 += 2;
                                }

                                else if (Ligne1[3] % 10 == 0) {
                                    teteDeBoeufBot3 += 3;
                                }

                                else if (Ligne1[3] % 11 == 0 && Ligne1[3] != 55) {
                                    teteDeBoeufBot3 += 5;
                                }

                                else if (Ligne1[3] == 55) {
                                    teteDeBoeufBot3 += 7;
                                }
                                else {
                                    teteDeBoeufBot3 += 1;
                                }



                                if (Ligne1[4] % 10 == 5) {
                                    teteDeBoeufBot3 += 2;
                                }

                                else if (Ligne1[4] % 10 == 0) {
                                    teteDeBoeufBot3 += 3;
                                }

                                else if (Ligne1[4] % 11 == 0 && Ligne1[4] != 55) {
                                    teteDeBoeufBot3 += 5;
                                }

                                else if (Ligne1[4] == 55) {
                                    teteDeBoeufBot3 += 7;
                                }
                                else {
                                    teteDeBoeufBot3 += 1;
                                }


                                Ligne1[0] = carteAleatoireBot3;
                                Ligne1[1] = 0;
                                Ligne1[2] = 0;
                                Ligne1[3] = 0;
                                Ligne1[4] = 0;
                                Ligne1[5] = 0;



                            }
                        }
                    }
                }
            }
        }


        else if (carteAleatoireBot3 < Ligne1[0]) {
            System.out.println("Le Bot 3 encaisse les cartes de la première ligne");
            System.out.println(carteAleatoireBot3 + "devient la première carte.");

            if (Ligne1[0] % 10 == 5) {
                teteDeBoeufBot3 += 2;
            }

            if (Ligne1[0] % 10 == 0) {
                teteDeBoeufBot3 += 3;
            }

            if (Ligne1[0] % 11 == 0 && Ligne1[0] != 55) {
                teteDeBoeufBot3 += 5;
            }

            if (Ligne1[0] == 55) {
                teteDeBoeufBot3 += 7;
            }
            else {
                teteDeBoeufBot3 += 1;
            }

            Ligne1[0] = carteAleatoireBot3;
            Ligne1[1] = 0;
            Ligne1[2] = 0;
            Ligne1[3] = 0;
            Ligne1[4] = 0;
            Ligne1[5] = 0;

        }




        for (int i = 0; i < Ligne1.length; i++) {
            System.out.println(Ligne1[i]);
        }

        System.out.println("");

        for (int i = 0; i < Ligne2.length; i++) {
            System.out.println(Ligne2[i]);
        }

        System.out.println("");

        for (int i = 0; i < Ligne3.length; i++) {
            System.out.println(Ligne3[i]);
        }

        System.out.println("");

        for (int i = 0; i < Ligne4.length; i++) {
            System.out.println(Ligne4[i]);
        }


        System.out.println("");

        System.out.println("Nombre Tête de boeuf du Joueur 1 : " + teteDeBoeufJoueur1);
        System.out.println("Nombre Tête de boeuf du Bot 1 : " + teteDeBoeufBot1);
        System.out.println("Nombre Tête de boeuf du Bot 2 : " + teteDeBoeufBot2);
        System.out.println("Nombre Tête de boeuf du Bot 3 : " + teteDeBoeufBot3);



     System.out.println("");

     if (teteDeBoeufJoueur1 >= 66) {
         System.out.println("Le joueur 1 a perdu !");
         System.exit(0);
     }

     if (teteDeBoeufBot1 >= 66) {
         System.out.println("Le Bot 1 a perdu !");
         System.exit(0);
     }

     if (teteDeBoeufBot2 >= 66) {
         System.out.println("Le Bot 2 a perdu !");
         System.exit(0);
     }

     if (teteDeBoeufBot3 >= 66) {
         System.out.println("Le Bot 3 a perdu !");
         System.exit(0);
     }


 }






    }



}