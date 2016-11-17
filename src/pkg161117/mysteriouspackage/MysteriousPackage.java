/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg161117.mysteriouspackage;

import java.util.*;
public class MysteriousPackage {

   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int classes,ID1,ID2,IDs;
        ArrayList<Integer> studentList=new ArrayList();
        ArrayList<Integer> periodList=new ArrayList();
        
        classes=input.nextInt();
        System.out.println("classes"+classes);
        ID1=input.nextInt();
        ID2=input.nextInt();
        System.out.println("ID"+ID1+"  "+ID2);
        
        for (int i=1;i<=classes;i++){
            int periods,students;
            periods=input.nextInt();
            students=input.nextInt();
            
            System.out.println("Class"+i+"  period"+periods+"  "+students);
            for(int x=1;x<=students;i++){
                IDs=input.nextInt();
                
                periodList.add(IDs);
                studentList.add(periods);
                System.out.println(x+"IDs"+IDs);
            }
            
        }
    }
    
}
