# PoC for using Spring ConfigurationProperties to parse JSON

This PoC shows how to use a custom ConfiguratonProperties Class for parsing JSON applicaion properties or environment 
variables and supply them to the application in a meaningful way.

In this PoC the property:

```json.data: '[{"name": "foo", "title": "bar", "key": "1"},{"name": "baz", "title": "qux", "key": "2"}]'```

is read by the ConfigurationProperties and parsed by a Jackson ObjectMapper so that a List of structured beans can be
read from the Java Configuration.