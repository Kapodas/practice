package functions;

public abstract class AbstractTabulatedFunction implements TabulatedFunction {
    public int sct(int res){
        arrX[0] = 1;
        arrX[1] = 4;
        arrX[2] = 6;
        res = 100;
        int i;
        double skipping = -5;

        for(i=0; i<3 ; i++){
            if(arrX[i] == skipping){
                res=i;
            }
        }
        for(i=0; i<2 ; i++){
            if(arrX[i] > skipping && arrX[i+1] > skipping){
                res=-1;
            }
        }
        for(i=0; i<2 ; i++){
            if(arrX[i] < skipping && arrX[i+1] > skipping){
                res=i;
            }
        }
        for(i=0; i<2 ; i++){
            if(arrX[i] < skipping && arrX[i+1] < skipping){
                res=-2;
            }
    }
        if(res == -1){
        return 0;
    }
        else{
            return res;
        }
    }
        }
class ATFunction extends AbstractTabulatedFunction{

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public double getX(int index) {

        return 0;
    }

    @Override
    public double getY(int index) {
        return 0;
    }

    @Override
    public void setY(int index, double value) {

    }

    @Override
    public int indexOfX(double x) {
        return 0;
    }

    @Override
    public int indexOfY(double y) {
        return 0;
    }

    @Override
    public double leftBound() {
        return 0;
    }

    @Override
    public double rightBound() {
        return 0;
    }
}
