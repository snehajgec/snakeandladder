package com.example.demo.lld.SnakesAndLadder.role;

import com.example.demo.lld.SnakesAndLadder.modal.Square;

/**
 * Created by enduser on 12/11/19.
 */


public final class SnakeRole extends SquareRole {
    private int transport ;

    public SnakeRole (Square s , int t ) {
        super(s);
        assert t < 0 : " A snake shift must be negative ";
        transport = t;
    }

    @Override
    public Square landHereOrGoHome() {
        System . out . println ( " snake from " + ( square . getPosition ()+1)
                + " to " + ( destination (). getPosition ()+1));
        return destination (). landHereOrGoHome ();
    }
    private Square destination () {
        return square . findRelativeSquare ( transport );
    }
}