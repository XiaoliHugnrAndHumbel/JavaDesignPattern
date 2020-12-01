package com.DesignPattern.State;

public class HighState extends AbstractState {

    HighState(AbstractState state){
        hj=state.hj;
        stateName="高等";
        score=state.score;
    }

    @Override
    public void CheckState() {
        if(score<60){
            hj.setState(new LowState(this));
        }else if (score<90){
            hj.setState(new MiddleState(this));
        }
    }
}
