# Example use kotlin-csv

What exception is thrown when try to read a csv file with [kotlin-csv](https://github.com/doyaaaaaken/kotlin-csv)?

## for example

throws **MalformedCSVException** when header 'name' is duplicated.

```kotlin
        try {
            csvReader().open(assets.open("invalid.csv")) {
                // throws MalformedCSVException
                readAllWithHeaderAsSequence().forEach { row: Map<String, String> ->
                    Log.d("CSV", row.getValue("name"))
                }
            }
        } catch(e: Exception) {
            e.printStackTrace()
        }
```

throws **NoSuchElementException** when Key ame is missing in the map.

```kotlin
        try {
            csvReader().open(assets.open("valid.csv")) {
                readAllWithHeaderAsSequence().forEach { row: Map<String, String> ->
                    // throws NoSuchElementException
                    Log.d("CSV", row.getValue("ame"))
                }
            }
        } catch(e: Exception) {
            e.printStackTrace()
        }
```        
