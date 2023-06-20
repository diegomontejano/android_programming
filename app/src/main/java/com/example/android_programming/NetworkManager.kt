package com.example.app
import com.example.android_programming.Book
import com.example.android_programming.Response
import com.google.gson.Gson

class NetworkManager {
    val jsonResponse = """
    {
        "data": {
            "Books": {
                "edges": [
                    {
                        "node": {
                        "id": "1",
                        "title": "livro 1"
                        }
                    },
                    {
                        "node": {
                        "id": "2",
                        "title": "livro 2"
                        }
                    },
                    {
                        "node": {
                        "id": "3",
                        "title": "livro 3"
                        }
                    }
                ]
            }
        }
    }
    """

    fun parseJson(): List<Book> {
        // add <implementation 'com.google.code.gson:gson:2.10.1'> to build.gradle (Module :app)
        val gson = Gson()
        val response = gson.fromJson(jsonResponse, Response::class.java)
        return response.data.Books.edges.map { it.node }
    }

}
