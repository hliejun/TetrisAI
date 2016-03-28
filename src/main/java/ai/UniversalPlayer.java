package ai;

import logic.Analysis;
import logic.HeuristicsPlayer;

/**
 * Created by maianhvu on 24/03/2016.
 */
public class UniversalPlayer extends HeuristicsPlayer {

    @Override
    protected double calculateHeuristics(Analysis analysis) {
        return -10.0 * analysis.getAggregateHeight() +
                -3.0 * analysis.getRoughness() +
                -29.0 * analysis.getHolesCount() +
                -7.0 * analysis.getCellsCount() +
                -5.0 * analysis.getHighestSlope();
    }
}
