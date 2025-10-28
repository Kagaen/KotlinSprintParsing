import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element

fun main() {

    val doc: Document = Jsoup.connect("https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/").get()
//    println(doc.title())

    val quoteHeadLines: org.jsoup.select.Elements = doc.select(".bzpNIu")
//    println(quoteHeadLines)

    for (quoerLine: Element in quoteHeadLines) {
        println("${quoerLine.text()}\n")
    }

}