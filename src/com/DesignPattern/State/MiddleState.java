package com.DesignPattern.State;

public class MiddleState extends AbstractState {

    MiddleState(AbstractState state){
        hj=state.hj;
        stateName="中等";
        score=state.score;
    }

    @Override
    public void CheckState() {
        if (score<60){
            hj.setState(new LowState(this));
        }else if (score>=90){
            hj.setState(new HighState(this));
        }
    }
}
