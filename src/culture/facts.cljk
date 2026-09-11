(ns culture.facts
  "Country-level regional-culture catalog for Romania (ROU) -- national
  dishes, protected products, beverages, crafts, festivals and heritage
  sites, per ADR-2607171400 addendum 2 (cloud-itonami-municipality-
  culture-catalog Wave 1, in com-junkawasaki/root). Sibling namespace to
  `marketentry.facts` / `statute.facts` (ADR-2607141700); city-level
  counterparts live in the cloud-itonami-municipality-* repos.

  Catalog is keyed by UPPERCASE ISO3 (mirrors `statute.facts`); entries
  carry no :culture/municipality (that attribute is city-level only).

  Every entry cites a source URL that was actually fetched and read on
  :culture/retrieved-at -- never fabricated. Summaries state only what the
  cited source confirms. An item not in this table has NO spec-basis, full
  stop; extend `catalog`, do not invent an id/url.")

(def catalog
  "iso3 -> vector of culture entries."
  {"ROU"
   [{:culture/id "rou.dish.sarmale"
     :culture/name "Sarmale"
     :culture/country "ROU"
     :culture/kind :dish
     :culture/summary "A central part of Romanian cuisine and the country's national dish, also eaten in Moldova."
     :culture/url "https://en.wikipedia.org/wiki/Sarmale"
     :culture/url-provenance :wikipedia-en
     :culture/retrieved-at "2026-07-17"}
    {:culture/id "rou.dish.mici"
     :culture/name "Mici"
     :culture/name-local "Mititei"
     :culture/country "ROU"
     :culture/kind :dish
     :culture/summary "Traditional dish from Romanian cuisine, consisting of grilled ground-meat sausages made from beef, lamb and pork with various spices."
     :culture/url "https://en.wikipedia.org/wiki/Mici"
     :culture/url-provenance :wikipedia-en
     :culture/retrieved-at "2026-07-17"}
    {:culture/id "rou.dish.papanasi"
     :culture/name "Papanasi"
     :culture/name-local "Papanași"
     :culture/country "ROU"
     :culture/kind :dish
     :culture/summary "Romanian dessert made from fresh-cheese dough, usually served topped with cream and fruit confit."
     :culture/url "https://en.wikipedia.org/wiki/Papana%C8%99i"
     :culture/url-provenance :wikipedia-en
     :culture/retrieved-at "2026-07-17"}
    {:culture/id "rou.beverage.tuica"
     :culture/name "Tuica"
     :culture/name-local "Țuică"
     :culture/country "ROU"
     :culture/kind :beverage
     :culture/summary "Traditional Romanian spirit that contains approximately 24-86% alcohol by volume and is prepared exclusively from plums."
     :culture/url "https://en.wikipedia.org/wiki/%C8%9Auic%C4%83"
     :culture/url-provenance :wikipedia-en
     :culture/retrieved-at "2026-07-17"}
    {:culture/id "rou.craft.martisor"
     :culture/name "Martisor"
     :culture/name-local "Mărțișor"
     :culture/country "ROU"
     :culture/kind :craft
     :culture/summary "Tradition celebrated at the beginning of Spring in March, involving a handmade object of two intertwined red and white strings with hanging tassels, originating from Roman New Year celebrations and practiced throughout Romania and Moldova."
     :culture/url "https://en.wikipedia.org/wiki/M%C4%83r%C8%9Bi%C8%99or"
     :culture/url-provenance :wikipedia-en
     :culture/retrieved-at "2026-07-17"}
    {:culture/id "rou.craft.horezu-ceramics"
     :culture/name "Horezu ceramics"
     :culture/country "ROU"
     :culture/kind :craft
     :culture/summary "Unique type of Romanian pottery traditionally produced by hand around the town of Horezu, recognized by UNESCO as intangible cultural heritage in 2012."
     :culture/url "https://en.wikipedia.org/wiki/Horezu_ceramics"
     :culture/url-provenance :wikipedia-en
     :culture/retrieved-at "2026-07-17"}
    {:culture/id "rou.heritage.wooden-churches-of-maramures"
     :culture/name "Wooden Churches of Maramures"
     :culture/name-local "Bisericile de lemn din Maramureș"
     :culture/country "ROU"
     :culture/kind :heritage
     :culture/summary "Eight wooden churches in the Maramures region were listed by UNESCO as World Heritage Sites in 1999, for their religious architecture and timber construction traditions."
     :culture/url "https://en.wikipedia.org/wiki/Wooden_Churches_of_Maramure%C8%99"
     :culture/url-provenance :wikipedia-en
     :culture/retrieved-at "2026-07-17"}]})

(defn spec-basis [iso3] (get catalog iso3))

(defn coverage
  ([] (coverage (keys catalog)))
  ([iso3s]
   (let [have (filter catalog iso3s)
         missing (remove catalog iso3s)]
     {:requested (count iso3s)
      :covered (count have)
      :covered-jurisdictions (vec (sort have))
      :missing-jurisdictions (vec (sort missing))
      :note (str "cloud-itonami-iso3166-rou culture catalog "
                 "(ADR-2607171400 addendum 2, Wave 1): " (count (get catalog "ROU"))
                 " ROU entries, each with a fetched-and-read citation. "
                 "Extend `culture.facts/catalog`, never fabricate an id/url.")})))

(defn by-kind [iso3 kind]
  (filterv #(= (:culture/kind %) kind) (spec-basis iso3)))
