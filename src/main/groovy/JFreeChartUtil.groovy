/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/*
import org.jfree.chart.ChartPanel
import org.jfree.chart.JFreeChart
import org.jfree.chart.axis.NumberAxis
import org.jfree.chart.axis.ValueAxis
import org.jfree.chart.labels.StandardXYToolTipGenerator
import org.jfree.chart.plot.Plot
import org.jfree.chart.plot.SpiderWebPlot
import org.jfree.chart.plot.XYPlot
import org.jfree.chart.renderer.xy.XYBubbleRenderer
import org.jfree.chart.renderer.xy.XYItemRenderer
import org.jfree.data.category.DefaultCategoryDataset
import org.jfree.data.xy.DefaultXYZDataset
import org.jfree.data.xy.XYDataset

import java.awt.*

class JFreeChartUtil {
    private JFreeChartUtil() {}

    static XYBubbleRenderer bubbleRenderer(float alpha = 0.2f) {
        def r = new XYBubbleRenderer()
        r.setDefaultToolTipGenerator(new StandardXYToolTipGenerator())
        // default colors are solid, make some semi-transparent ones
        r.setSeriesPaint(0, new Color(1, 0, 0, alpha))
        r.setSeriesPaint(1, new Color(0, 0, 1, alpha))
        r.setSeriesPaint(2, new Color(0, 1, 0, alpha))
        r.setSeriesPaint(3, new Color(0.8, 0.8, 0, alpha))
        r.setSeriesPaint(4, new Color(0.8, 0, 0.8, alpha))
        r.setSeriesPaint(5, new Color(0, 0.8, 0.8, alpha))
        r.setSeriesPaint(6, new Color(1f, 0.2f, 0f, 0.4f))
        r.setSeriesPaint(7, new Color(1, 0, 0.2f, 0.4f))
        r.setSeriesPaint(8, new Color(0, 1, 0.2f, 0.4f))
        r.setSeriesPaint(9, new Color(0.2f, 1, 0, 0.4f))
        r.setSeriesPaint(10, new Color(0.2f, 0, 1, 0.4f))
        r.setSeriesPaint(11, new Color(0, 0.2f, 1, 0.4f))
        r.setSeriesPaint(12, new Color(0.6, 0.2, 0.2, alpha))
        r.setSeriesPaint(13, new Color(0.2, 0.2, 0.6, alpha))
        r.setSeriesPaint(14, new Color(0.2, 0.6, 0.2, alpha))
        r
    }

    static ChartPanel chart(String title, Plot plot) {
        new ChartPanel(new JFreeChart(title, plot), false)
    }

    static SpiderWebPlot spiderWebPlot(Map args) {
        new SpiderWebPlot(args)
    }

    static XYPlot xyPlot(XYDataset dataset, ValueAxis domainAxis, ValueAxis rangeAxis, XYItemRenderer renderer) {
        new XYPlot(dataset, domainAxis, rangeAxis, renderer)
    }

    static DefaultCategoryDataset categoryDataset() {
        new DefaultCategoryDataset()
    }

    static DefaultXYZDataset xyzDataset() {
        new DefaultXYZDataset()
    }

    static NumberAxis numberAxis(Map args) {
        new NumberAxis(args)
    }
}
/* */
