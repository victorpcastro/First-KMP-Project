package moc.compose.kmm

expect class Platform() {
    val osName: String
    val osVersion: String
    val deviceModel: String
}