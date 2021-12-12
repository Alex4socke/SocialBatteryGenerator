package com.alex4socke.socialbatterygenerator.generator;

public class StatusGenerator {
        private final String darkShade = "▓";
        private final String lightShade = "░";

        public StatusGenerator() {

        }

        public String generateSocialBatteryStatus(int percentage) {
            if (percentage > 100 || percentage % 10 != 0 || percentage < 0) {
                throw new IllegalStateException();
            }
            StringBuilder sB = new StringBuilder();
            switch (percentage){
                case 0:
                    for(int i = 0; i < 10; i++) {
                        sB.append(lightShade);
                    }

                case 10:
                    sB.append(darkShade);
                    for(int i = 0; i < 9; i++) {
                        sB.append(lightShade);
                    }

                case 20:
                    for(int i = 0; i < 2; i++) {
                        sB.append(darkShade);
                    }
                    for(int i = 0; i < 8; i++) {
                        sB.append(lightShade);
                    }

                case 30:
                    for(int i = 0; i < 3; i++) {
                        sB.append(darkShade);
                    }
                    for(int i = 0; i < 7; i++) {
                        sB.append(lightShade);
                    }

                case 40:
                    for(int i = 0; i < 4; i++) {
                        sB.append(darkShade);
                    }
                    for(int i = 0; i < 6; i++) {
                        sB.append(lightShade);
                    }

                case 50:
                    for(int i = 0; i < 5; i++) {
                        sB.append(darkShade);
                    }
                    for(int i = 0; i < 5; i++) {
                        sB.append(lightShade);
                    }

                case 60:
                    for(int i = 0; i < 6; i++) {
                        sB.append(darkShade);
                    }
                    for(int i = 0; i < 4; i++) {
                        sB.append(lightShade);
                    }

                case 70:
                    for(int i = 0; i < 7; i++) {
                        sB.append(darkShade);
                    }
                    for(int i = 0; i < 3; i++) {
                        sB.append(lightShade);
                    }

                case 80:
                    for(int i = 0; i < 8; i++) {
                        sB.append(darkShade);
                    }
                    for(int i = 0; i < 2; i++) {
                        sB.append(lightShade);
                    }

                case 90:
                    for(int i = 0; i < 9; i++) {
                        sB.append(darkShade);
                    }
                    sB.append(lightShade);

                case 100:
                    for(int i = 0; i < 10; i++) {
                        sB.append(darkShade);
                    }


                default: sB.append(" " + percentage + "%");
                    break;
            }

            return sB.toString();
        }

    }