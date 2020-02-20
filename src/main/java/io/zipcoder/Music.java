package io.zipcoder;

import com.sun.tools.javac.util.ArrayUtils;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.logging.Logger;

public class Music {


    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        int forButMove = 0;
        int bacButMove = 0;
        int conditIndex;

        //go through the playList[] for index
        //see if index is equal to selection
        //set condition index to equal i
        //see if condition index > startIndex
        //set integer forward moves equal to condition index - startIndex
        // see if condition index < playList length - 1
        // set integer back moves equal to playList length -1 - condition index
        for(int i = 0; i < playList.length; i++){
            if(selection.equals(playList[i])){
                conditIndex = i;
                if(conditIndex > startIndex){
                    forButMove = conditIndex - startIndex;
                    if(conditIndex < playList.length - 1){
                        bacButMove = playList.length- 1 -conditIndex;
                    }
                }
            }
        }
        //see if forward moves > back moves and back moves aren't equal to 0
        //return back moves else return forward moves
            if(forButMove > bacButMove && bacButMove != 0){
                return bacButMove;
            }else
        return forButMove;
    }

}
