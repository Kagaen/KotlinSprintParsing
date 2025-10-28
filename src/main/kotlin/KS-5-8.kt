import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements

fun main() {

    val doc: Document = Jsoup.connect("https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/").get()

    val quoteHeadLines: Elements = doc.select("article")

    for (quoteLine: Element in quoteHeadLines) {
        println("${quoteLine.text()}\n")
    }

}