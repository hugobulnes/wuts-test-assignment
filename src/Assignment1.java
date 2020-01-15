/**
 * Failing Assignment
 */
class Assignment1{

    /**
     * It takes a two dimensional array and convert it into a one dimensional array 
     */
    public int[] twoDimensionalToOneDimensional(int[][] twoArr){
        int[] oneArr = null;

        if(twoArr != null){
            
            oneArr = new int[twoArr.length * twoArr[0].length];
            
            int start = 0;

            for(int[] row: twoArr){
                int end = row.length;
                System.arraycopy(row, 0, oneArr, start, end);
                start += end;
            }
        }

        return oneArr;
    }

    /**
     * Rotates a knob to the right by the number of rotations provided      
     */
    public void rorateKnobRight(int[] volumes, int rotations){
        if(volumes != null){

            int topVolumeIndex = volumes.length - rotations;

            int[] leftVolumes = new int[topVolumeIndex];

            //Copy left size
            System.arraycopy(volumes, 0, leftVolumes, 0, topVolumeIndex);

            //relocate right size
            System.arraycopy(volumes, topVolumeIndex, volumes, 0, volumes.length - topVolumeIndex);
            
            //merge left size
			System.arraycopy(leftVolumes, 0, volumes, volumes.length - topVolumeIndex, topVolumeIndex);
        }
    }

    /**
     * Rotates a knob to the left by the number of rotations provided      
     */
    public void rorateKnobLeft(int[] volumes, int rotations){
        if(volumes != null){            

            int[] leftVolumes = new int[rotations];

            //Copy left size
            System.arraycopy(volumes, 0, leftVolumes, 0, rotations);

            //relocate right size
            System.arraycopy(volumes, rotations, volumes, 0, volumes.length - rotations);
            
            //merge left size
			System.arraycopy(leftVolumes, 0, volumes, volumes.length - rotations, rotations);
        }
    }

}