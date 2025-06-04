
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exerciciopropostomap;

import entities.candidaty;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author crist
 */
public class ExercicioPropostoMap {

    public static void main(String[] args) {

        Map<String, Integer> candidats = new TreeMap<>();

        String caminho = "C:\\Temp\\DocMapFixacaoAtv.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
                        
            String line = br.readLine();
            
            while(line != null){
                String[] fields = line.split(",");
                String name = fields[0];
                int quantityVotes = Integer.parseInt(fields[1]);
           
                candidats.merge(name, quantityVotes, Integer::sum);
           
                line = br.readLine();
            }
            
            System.out.println("RESULTADO DAS ELEIÇÕES: ");
            for(String key :candidats.keySet()){
                System.out.println(key + ": " + candidats.get(key));
            }
            
        } catch(IOException e){
               System.out.println("Error: " + e.getMessage());
                
                }

        }
    }
