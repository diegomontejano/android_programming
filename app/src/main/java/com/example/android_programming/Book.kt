package com.example.android_programming

data class Response(val data: Data)
data class Data(val Books: Books)
data class Books(val edges: List<Node>)
data class Node(val node: Book)
data class Book(val id: String, val title: String)
