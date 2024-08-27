Our goal is to only generate documentation for some controllers in a specific package without leaking anything else.<br>
For now, we are just adding `@Hidden` annotation to the controllers we don't want to expose.<br>
It's very error-prone for new controllers added, leaking their definition if the annotation is not added.<br>
We'd rather have an opt-in approach.

Using [groups packages configuration](https://micronaut-projects.github.io/micronaut-openapi/latest/guide/index.html#groups): the endpoints are properly filtered.

The only issue with controllers not included in the filter:
some classes used as properties in request/response objects are still exposed in schemas even if the request/response is not.

This issue does not happen if the controller is hidden using `@Hidden` instead of just being excluded by the filter.

It may very well be caused by a missing configuration or a misunderstanding of the feature.
