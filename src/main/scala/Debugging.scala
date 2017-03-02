import com.sksamuel.elastic4s.ElasticDsl._
import com.sksamuel.elastic4s.searches.aggs.AggregationDefinition
import org.elasticsearch.search.aggregations.bucket.histogram.DateHistogramInterval

object Debugging {

  def trivialQuery: AggregationDefinition =
    termsAggregation("by_some_field").field("some_field")

  def someQuery: AggregationDefinition =
    filterAggregation("filtered").query(
      filter(
        rangeQuery("some_date_field")
          .gte("now-1y")
          .to("now")
      )
    ).subAggregation(
        dateHistogramAggregation("per_month")
          .field("some_date_field")
          .interval(DateHistogramInterval.MONTH)
          .minDocCount(0L)
      )

}
