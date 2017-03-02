# Reproduction

```
$ sbt console
scala> val tq = Debugging.trivialQuery
tq: com.sksamuel.elastic4s.searches.aggs.AggregationDefinition = TermsAggregationDefinition(by_some_field,Some(some_field),None,None,None,None,None,None,None,None,None,None,None,None,List(),List(),Map())

scala> val sq = Debugging.someQuery
```

# Expected Result:

```
sq: com.sksamuel.elastic4s.searches.aggs.AggregationDefinition = ???
```

# Result:

```
java.lang.StackOverflowError
  at com.sksamuel.elastic4s.searches.aggs.AggregationDefinition$class.subAggregation(AggregationDefinition.scala:15)
  at com.sksamuel.elastic4s.searches.aggs.FilterAggregationDefinition.subAggregation(FilterAggregationDefinition.scala:6)
  at com.sksamuel.elastic4s.searches.aggs.AggregationDefinition$class.subAggregation(AggregationDefinition.scala:15)
  at com.sksamuel.elastic4s.searches.aggs.FilterAggregationDefinition.subAggregation(FilterAggregationDefinition.scala:6)
  at com.sksamuel.elastic4s.searches.aggs.AggregationDefinition$class.subAggregation(AggregationDefinition.scala:15)
  at com.sksamuel.elastic4s.searches.aggs.FilterAggregationDefinition.subAggregation(FilterAggregationDefinition.scala:6)
  at com.sksamuel.elastic4s.searches.aggs.AggregationDefinition$class.subAggregation(AggregationDefinition.scala:15)
  at com.sksamuel.elastic4s.searches.aggs.FilterAggregationDefinition.subAggregation(FilterAggregationDefinition.scala:6)
  at com.sksamuel.elastic4s.searches.aggs.AggregationDefinition$class.subAggregation(AggregationDefinition.scala:15)
  at com.sksamuel.elastic4s.searches.aggs.FilterAggregationDefinition.subAggregation(FilterAggregationDefinition.scala:6)
  at com.sksamuel.elastic4s.searches.aggs.AggregationDefinition$class.subAggregation(AggregationDefinition.scala:15)
  at com.sksamuel.elastic4s.searches.aggs.FilterAggregationDefinition.subAggregation(FilterAggregationDefinition.scala:6)
  at com.sksamuel.elastic4s.searches.aggs.AggregationDefinition$class.subAggregation(AggregationDefinition.scala:15)
  at com.sksamuel.elastic4s.searches.aggs.FilterAggregationDefinition.subAggregation(FilterAggregationDefinition.scala:6)
  at com.sksamuel.elastic4s.searches.aggs.AggregationDefinition$class.subAggregation(AggregationDefinition.scala:15)
  at com.sksamuel.elastic4s.searches.aggs.FilterAggregationDefinition.subAggregation(FilterAggregationDefinition.scala:6)
  at com.sksamuel.elastic4s.searches.aggs.AggregationDefinition$class.subAggregation(AggregationDefinition.scala:15)
  at com.sksamuel.elastic4s.searches.aggs.FilterAggregationDefinition.subAggregation(FilterAggregationDefinition.scala:6)
  at com.sksamuel.elastic4s.searches.aggs.AggregationDefinition$class.subAggregation(AggregationDefinition.scala:15)
  at com.sksamuel.elastic4s.searches.aggs.FilterAggregationDefinition.subAggregation(FilterAggregationDefinition.scala:6)
  at com.sksamuel.elastic4s.searches.aggs.AggregationDefinition$class.subAggregation(AggregationDefinition.scala:15)
  at com.sksamuel.elastic4s.searches.aggs.FilterAggregationDefinition.subAggregation(FilterAggregationDefinition.scala:6)
  at com.sksamuel.elastic4s.searches.aggs.AggregationDefinition$class.subAggregation(AggregationDefinition.scala:15)
  at com.sksamuel.elastic4s.searches.aggs.FilterAggregationDefinition.subAggregation(FilterAggregationDefinition.scala:6)
  at com.sksamuel.elastic4s.searches.aggs.AggregationDefinition$class.subAggregation(AggregationDefinition.scala:15)


  +++
```
