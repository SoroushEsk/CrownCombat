//package com.tokyo.game.tokyo_game.security.captcha;
//
//import java.awt.*;
//import java.awt.image.BufferedImage;
//import java.util.Random;
//
//public class Captcha {
//
//    private static int Frame_Size = 5;
//    private static final Random random = new Random();
//
//
//    private int width;
//    private final int height = 30;
//    private String answer;
//    private final BufferedImage bufferedImage ;
//    private final Graphics graphics ;
//    private final Graphics2D graphics2D ;
//
//    public Captcha(){
//        String pattern = createRandomNumber();
//        bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
//        graphics = bufferedImage.getGraphics();
//        graphics2D = (Graphics2D) graphics;
//        graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
//        graphics2D.setColor(Color.WHITE);
//        graphics2D.fillRect(0, 0, width, height);
//        graphics2D.setColor(Color.BLACK);
//        graphics2D.drawString(pattern, 0, 24);
//    }
//
//    private String createRandomNumber(){
//        int char_number = Math.abs(random.nextInt())%3;
//        char_number += Captcha.Frame_Size;
//        width = char_number * 10;
//
//        StringBuilder answer = new StringBuilder();
//        StringBuilder pattern = new StringBuilder();
//
//        for ( int i = 0 ; i < char_number ; i++){
//            int randomDigit = Math.abs(random.nextInt())%10;
//            answer.append(randomDigit);
//            pattern.append(randomDigit).append(" ");
//        }
//
//        this.answer = answer.toString().trim();
//        return pattern.toString();
//    }
//    public boolean checkInput(String input){
//        return answer.equals(input.trim());
//    }
//
//    //////////////***** should't use terminal ************
//    public void printCaptcha(){
//        for (int y = 0; y < height; y++) {
//            StringBuilder stringBuilder = new StringBuilder();
//            boolean isSpace = true;
//            for (int x = 0; x < width; x++) {
//                if ( bufferedImage.getRGB(x, y) != Color.WHITE.getRGB()) isSpace = false;
//                if ( random.nextInt()%7 != 0 )
//                    stringBuilder.append(bufferedImage.getRGB(x, y) == Color.WHITE.getRGB() ? " " : "*");
//                else stringBuilder.append(random.nextBoolean() ? "-":".");
//            }
//            if (isSpace) {
//                continue;
//            }
//            System.out.println(stringBuilder);
//        }
//    }
//}
