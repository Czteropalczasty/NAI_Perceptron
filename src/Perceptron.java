public class Perceptron {
    float [] vectorOfWeights;
    float threshhold;


    Perceptron(int dimensions, float threshhold){
        vectorOfWeights = new float[dimensions];
        this.threshhold = threshhold;
        createRandomVectorOfWeights();
    }

    private void createRandomVectorOfWeights(){
        for (int i = 0; i < vectorOfWeights.length; i++) {
            vectorOfWeights[i] = (float)(Math.random()*10)-5;
        }
    }
}
