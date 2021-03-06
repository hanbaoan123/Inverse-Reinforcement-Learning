
/**
 * 
 * @author Ivomar Brito Soares
 *
 */
public class TRLTransitionProbabilitiesActionMoveSouth extends ARLTransitionProbabilities {

	@Override
	protected boolean getAgentStaysAtTheSameCellWithTwoSurroudingWallsWithWallAtDirectionOfAction(IRLCell aOriginCell) {
		return aOriginCell.getSouthWall() != null && ( aOriginCell.getWestWall() != null || aOriginCell.getEastWall() != null ) ;
	}

	@Override
	protected boolean getAgentStaysAtTheSameCellWithWallAtDirectionOfAction(IRLCell aOriginCell) {
		return aOriginCell.getSouthWall() != null;
	}

	@Override
	protected boolean getDestinationCellIsNeighborInTheDirectionOfAction(IRLCell aOriginCell, IRLCell aDestinationCell) {
		return aDestinationCell == aOriginCell.getSouthCell();
	}

	@Override
	protected boolean getDestinationCellIsNeighborNotInTheDirectionOfAction(IRLCell aOriginCell, IRLCell aDestinationCell) {
		return  aDestinationCell == aOriginCell.getNorthCell() || aDestinationCell == aOriginCell.getEastCell() || aDestinationCell == aOriginCell.getWestCell();
	}
	
	@Override
	protected boolean getAgentStaysAtTheSameCellWithTwoSurroudingWallsWithoutWallAtDirectionOfAction(	IRLCell aOriginCell) {
		return aOriginCell.getSouthWall() == null && aOriginCell.getWallCount() == 2;
	}

}
