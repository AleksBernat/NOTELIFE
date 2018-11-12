package NoteSystem;

import java.util.ArrayList;

public class Search {


    public static ArrayList<Note> sortListBy(ArrayList<Note> noteList, String searchTerm) {
        int[] relevanceScoreList = new int[noteList.size()];
        String[] searchList = searchTerm.toLowerCase().split(" ");
        for (int s = 0; s < searchList.length; s++) {
            for (int i = 0; i < noteList.size(); i++) {
               

                String[] noteTitle = noteList.get(i).title.toLowerCase().split(" ");
                for(int q = 0; q<noteTitle.length; q++){
                    if(noteTitle[q].equals(searchList[s])){
                        relevanceScoreList[i] += 20;
                    }else if(noteTitle[q].contains(searchList[s])){
                                relevanceScoreList[i] += 5;
                   }
                }
                

                String[] noteDescription = noteList.get(i).description.toLowerCase().split(" ");
                for(int q = 0; q<noteDescription.length; q++){
                    if(noteDescription[q].equals(searchList[s])){
                        relevanceScoreList[i] += 3;
                    }else if(noteDescription[q].contains(searchList[s])){
                                relevanceScoreList[i] += 2; 
                   }
                }
            }
        }
        for(int i=0; i < noteList.size()-1; i++){
            for(int j=1; j < noteList.size()-i; j++){
                if(relevanceScoreList[j-1] < relevanceScoreList[j]){
                    Note temp=noteList.get(j-1);
                    noteList.set(j-1, noteList.get(j));
                    noteList.set(j, temp);
                    
                    int temp2 = relevanceScoreList[j-1];
                    relevanceScoreList[j-1] = relevanceScoreList[j];
                    relevanceScoreList[j] = temp2;
                }
            }
        }
        
        return noteList;
    }
}
