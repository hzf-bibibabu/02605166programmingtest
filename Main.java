import javax.swing.*;
import assessments.AssessmentFeed;

import java.awt.*;
import java.util.List;
import java.util.ArrayList;



class Main{static public void main(String[] args){
    JFrame framelaeder=new JFrame("leader");
    framelaeder.setSize(2000,3500);
    framelaeder.setVisible(true);


    List<String> allstudentscid=AssessmentFeed.getCIDs();
    framelaeder.setLayout(new GridLayout(allstudentscid.size(),1));
    JPanel[] panelleaders=new JPanel[allstudentscid.size()];
    JLabel[] labelsleader=new JLabel[allstudentscid.size()];
    String textforad="";
    double[] noaiaverag=new double[allstudentscid.size()];
    double[] haveaiaverage=new double[allstudentscid.size()];


    for(int i=0;i<allstudentscid.size();i++){
        panelleaders[i]=new JPanel();

    }
    for(int i=0;i< allstudentscid.size();i++){
        labelsleader[i]=new JLabel("waiting for loading");
        panelleaders[i].add(labelsleader[i]);
    }
    for(int i=0;i<allstudentscid.size();i++){
        framelaeder.add(panelleaders[i]);
        panelleaders[i].setVisible(true);
    }

    JFrame framemoudle=new JFrame("moudleleader");
    framemoudle.setSize(2000,3500);
    framemoudle.setLayout(new GridLayout(allstudentscid.size(),1));


    JPanel[] panelmoudle=new JPanel[allstudentscid.size()];
    JLabel[] labelsmoudle=new JLabel[allstudentscid.size()];
    framemoudle.setVisible(true);




    for(int i=0;i<allstudentscid.size();i++){
        panelmoudle[i]=new JPanel();

    }
    for(int i=0;i< allstudentscid.size();i++){
        labelsmoudle[i]=new JLabel("waiting for loading");
        panelmoudle[i].add(labelsmoudle[i]);
    }
    for(int i=0;i<allstudentscid.size();i++){
        framemoudle.add(panelmoudle[i]);
        panelmoudle[i].setVisible(true);
    }





    System.out.println(allstudentscid);
    String[] names=new String[allstudentscid.size()];
    String[] types=new String[allstudentscid.size()];
    for(int i=0;i< names.length;i++){
        names[i]=AssessmentFeed.getStudentName(allstudentscid.get(i));
        types[i]=AssessmentFeed.getStudentType(allstudentscid.get(i));
    }
    student[] students=new student[allstudentscid.size()];
    System.out.println(AssessmentFeed.getResult(allstudentscid.get(1),"Independent Programming Test","Program mark"));
    for(int i=0;i<names.length;i++){
        students[i]=new student(allstudentscid.get(i),names[i],types[i]);
    }
    for(int i=0;i< names.length;i++){
        students[i].setIndeprogrammingtest(AssessmentFeed.getResult(allstudentscid.get(i),"Independent Programming Test","Program mark"),AssessmentFeed.getResult(allstudentscid.get(i),"Independent Programming Test","Explained successfully"));
    }
    for(int i=0;i< names.length;i++){
        students[i].setAisoftware(AssessmentFeed.getResult(allstudentscid.get(i),"AI-Assisted Programming Project","Functionality mark"),AssessmentFeed.getResult(allstudentscid.get(i),"AI-Assisted Programming Project","Verification mark"));
    }
    for(int i=0;i< names.length;i++){
        students[i].setDesignviva(AssessmentFeed.getResult(allstudentscid.get(i),"Software Design Viva","Explanation mark"),AssessmentFeed.getResult(allstudentscid.get(i),"Software Design Viva","Design mark"));
    }
    for(int i=0;i< names.length;i++){
        labelsleader[i].setText(students[i].getName()+students[i].getCid()+students[i].getType()+"Independent Programming Test"+students[i].getIndeprogrammingtest()+"AI-Assisted Programming Project"+students[i].getAisoftware()+"Software Design Viva"+students[i].getDesignviva()+"totalmark"+students[i].getTotalmark());
    }


    for(int i=0;i< names.length;i++){
        textforad=textforad+students[i].getName()+students[i].getCid()+students[i].getType()+"Independent Programming Test"+students[i].getIndeprogrammingtest()+"AI-Assisted Programming Project"+students[i].getAisoftware()+"Software Design Viva"+students[i].getDesignviva()+"totalmark"+students[i].getTotalmark()+"Independent Programming Test"+students[i].getRealindepro()+students[i].getPassininde()+"AI-Assisted Programming Project"+students[i].getFunctionality()+students[i].getVerification()+"Software Design Viva"+students[i].getExplan()+students[i].getDeign()+"\n";

    }
    for(int i=0;i< names.length;i++){
        noaiaverag[i]=students[i].getIndeprogrammingtest()+students[i].getDesignviva();
        noaiaverag[i]=noaiaverag[i]/2;
        haveaiaverage[i]=students[i].getAisoftware();
        labelsmoudle[i].setText(students[i].getName()+students[i].getCid()+noaiaverag[i]+"   "+haveaiaverage[i]);
        if(noaiaverag[i]-haveaiaverage[i]<-20.0){
            panelmoudle[i].setBackground(Color.RED);
        }

    }


    System.out.println(textforad);









}}