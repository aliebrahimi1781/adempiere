//TODO:Copyright message should go here!
package org.eevolution.ui.gwt.client.presenter;



import org.eevolution.ui.gwt.client.ADempiereEventBus;
//import org.eevolution.ui.gwt.client.view.GraphView;
import com.google.gwt.user.client.ui.Widget;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;

/**
 * ADempiere GWT GraphPresenter
 * @author <a href="mailto:alberto.juarez@e-evolution.com">Alberto Juarez Caballero , www.e-evolution.com</a>
 * @version $Id: GraphPresenter.java, v 1.0 Feb 19, 2010
 */

//@Presenter(view=GraphView.class)
public class GraphPresenter extends BasePresenter<GraphPresenter.IGraphView,ADempiereEventBus> {
	public interface IGraphView{
		
		public void setGoal();
		public boolean isChartSelection();
		public void setChartSelection(boolean chartSelection);
		public void render();
		public void loadData();
		public void getPoint0_0();
		public String getX_AxisLabel();
		public void setX_AxisLabel(String axisLabel);
		public String getY_AxisLabel();
		public void setY_AxisLabel(String axisLabel);
		public String getY_TargetLabel();
		public void setY_TargetLabel(String targetLabel, double target);
		public int getZoomFactor();
		public void setZoomFactor(int zoomFactor);
		public boolean isRenderTable();
		public void setRenderTable(boolean mRenderTable);
		public boolean isRenderChart();
		public void setRenderChart(boolean mRenderChart);
		public void renderTable();
		
		
		
		public Widget getViewWidget();
		
	}

	
}
