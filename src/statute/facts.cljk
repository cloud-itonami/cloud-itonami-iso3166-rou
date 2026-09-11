(ns statute.facts
  "General-law compliance catalog for Romania (ROU) -- extends this repo's
  existing `marketentry.facts` (public-procurement market-entry only,
  narrow scope) with a second, orthogonal catalog of statutes a company
  operating in this jurisdiction must generally track for compliance.
  Mirrors cloud-itonami-iso3166-pol/-bgr/-deu/-fra/-hrv/-srb/-svn's
  `statute.facts` (ADR-2607141700, cloud-itonami-compliance-fact-
  federation). Romania was previously culture-catalog + marketentry-only
  in this repo, with no statute.facts -- this entry closes that
  structural country-axis gap.

  PROVENANCE DISCLOSURE (read before trusting any citation below):

  Legea societăților nr. 31/1990 (Companies Law) -- fetched directly
  from onrc.ro (Oficiul Național al Registrului Comerțului, the SAME
  official authority `marketentry.facts` already cites as
  `:corporate-number-provenance` \"https://www.onrc.ro/\" -- this entry
  extends that existing citation rather than duplicating or contradicting
  it). https://www.onrc.ro/index.php/ro/legislatie lists it verbatim as
  'Legea societăților nr. 31/1990 - republicată, cu modificările şi
  completările ulterioare' and links to ONRC's own consolidated text
  (fetched this session as a .docx, converted locally): its header states
  'LEGEA SOCIETĂȚILOR nr. 31/1990 1) Republicare' with footnote 1) reading
  'Republicată în temeiul art. XII din titlul II al cărţii a II-a din
  Legea nr. 161/2003 ..., publicată în Monitorul Oficial al României,
  Partea I, nr. 279 din 21 aprilie 2003 ... Legea nr. 31/1990 a mai fost
  republicată în Monitorul Oficial al României, Partea I, nr. 33 din 29
  ianuarie 1998'. The ORIGINAL 1990 Monitorul Oficial issue number/day
  was NOT independently re-confirmed this session (ONRC's own hosted
  consolidated text does not restate it) -- `:statute/enacted-date` below
  is therefore the CONFIRMED 2003 republication-basis date, not an
  invented original-1990 date; see `:statute/law-number` for the full
  disclosed citation chain. ONRC also lists the most recent amending acts
  (Legea nr. 223/2020, Legea nr. 222/2023).

  LEGE nr. 190 din 18 iulie 2018 (measures implementing GDPR Regulation
  (EU) 2016/679) -- the STRONGEST citation in this catalog: fetched as a
  primary full-text PDF directly from the official Romanian DPA's
  (ANSPDCP, Autoritatea Națională de Supraveghere a Prelucrării Datelor
  cu Caracter Personal) own document server this session
  (dataprotection.ro/servlet/ViewDocument?id=1520). The fetched text's
  own header reads verbatim: 'LEGE nr. 190 din 18 iulie 2018 privind
  măsuri de punere în aplicare a Regulamentului (UE) 2016/679 al
  Parlamentului European şi al Consiliului din 27 aprilie 2016 privind
  protecţia persoanelor fizice în ceea ce priveşte prelucrarea datelor cu
  caracter personal şi privind libera circulaţie a acestor date şi de
  abrogare a Directivei 95/46/CE (Regulamentul general privind protecţia
  datelor)' -- i.e. Romania's OWN implementing-measures law makes the
  EU Regulation the substantive basis explicit in its own Article 1, the
  same EU+national dual-citation shape the sibling France/Germany/Poland
  entries use (a national act naming the EU instrument it exists to
  apply, cited as ONE catalog entry -- this fleet does not carry a
  separate EU-regulation catalog entry alongside the national one; no
  sibling `statute.facts` file does). ANSPDCP's own summary page
  (dataprotection.ro/?page=Legea_nr_190_2018&lang=ro) additionally states
  the law 'entered into force on July 31, 2018'. The exact Monitorul
  Oficial issue number was NOT shown on either ANSPDCP page fetched this
  session -- disclosed explicitly rather than invented (this project's
  training-era general knowledge places it at M. Of. nr. 651/2018, but
  that number is NOT independently re-verified this session against a
  fetched source, so it is deliberately omitted from `:statute/law-number`
  below rather than stated as confirmed).

  Legea nr. 53/2003 (Codul muncii / Labour Code) -- the WEAKEST-provenance
  entry of the three: Romania's own labour-ministry/inspectorate sites
  (mmuncii.ro, inspectiamuncii.ro) were either unreachable this session
  or did not surface the citation in the specific pages fetched, so this
  entry rests on ro.wikipedia.org (secondary, not an official government
  source) -- disclosed here explicitly rather than presented as
  official-government-sourced, the same honesty discipline the Serbia and
  Slovenia siblings use for their weaker-tier entries. ro.wikipedia.org
  states the law was adopted 24 January 2003 and that its currently-in-
  force republished form was published in 'Monitorul Oficial al României,
  Partea I, nr. 345 din 18 mai 2011' (following amendment by Legea nr.
  40/2011).

  CONNECTIVITY DISCLOSURE -- a FOURTH candidate entry, Legea nr. 98/2016
  privind achizițiile publice (Public Procurement Law, which would
  directly extend `marketentry.facts`'s existing but vague
  `:legal-basis \"Legea achizițiilor publice; EU directives\"` with a
  precise citation, implementing EU Directive 2014/24/EU), was
  DELIBERATELY DROPPED from this catalog rather than seeded with an
  unverified number/date. Every official source that would carry it --
  legislatie.just.ro (the official ELI-style registry named in this
  project's own research instructions), anap.gov.ro, e-licitatie.ro,
  cdep.ro, and gov.ro's own search -- failed this session with
  connection-level errors (socket hang up / ECONNREFUSED / ECONNRESET /
  HTTP 503) on every domain and every path tried, repeatedly, across both
  https and http. NONE of these were a CAPTCHA / Cloudflare 'Just a
  moment' / bot-detection challenge page -- no challenge was ever served,
  so no bypass technique was attempted or would have been appropriate
  either way (the same genuine-connectivity-failure shape the Serbia
  sibling disclosed for pravno-informacioni-sistem.rs). Two Romanian
  government-adjacent domains (onrc.ro, dataprotection.ro) and one
  general one (gov.ro, monitoruloficial.ro homepage) WERE reachable this
  session, proving the failures above are host-specific outages, not a
  blanket network block -- but no reachable page this session named
  'Legea 98/2016' with a citation. A smaller honest catalog beats a
  padded one (the Slovenia sibling's own words); extend `catalog` with
  the procurement entry once an official or independently-corroborating
  source is actually reachable and fetched, never invent one meanwhile.

  A law not in this table has NO spec-basis, full stop; extend
  `catalog`, do not invent an id/url/date.")

(def catalog
  "ISO3166 alpha-3 -> vector of statute entries."
  {"ROU"
   [{:statute/id "rou.legea-31-1990-legea-societatilor"
     :statute/title "Legea societăților nr. 31/1990 (Companies Law)"
     :statute/jurisdiction "ROU"
     :statute/kind :law
     :statute/law-number "republicată; republicare curentă publicată în Monitorul Oficial al României, Partea I, nr. 279 din 21 aprilie 2003 (republicare anterioară: Partea I, nr. 33 din 29 ianuarie 1998); modificată ulterior inclusiv prin Legea nr. 223/2020 și Legea nr. 222/2023 -- exact original-1990 Monitorul Oficial issue number not independently re-confirmed this session, see catalog docstring"
     :statute/url "https://www.onrc.ro/index.php/ro/legislatie"
     :statute/url-provenance :official-onrc
     :statute/enacted-date "2003-04-21"
     :statute/retrieved-at "2026-07-23"
     :statute/topic #{:corporate-governance :incorporation}}
    {:statute/id "rou.legea-190-2018-gdpr-implementing-measures"
     :statute/title "Legea nr. 190/2018 privind măsuri de punere în aplicare a Regulamentului (UE) 2016/679 (GDPR implementing-measures law)"
     :statute/jurisdiction "ROU"
     :statute/kind :law
     :statute/law-number "LEGE nr. 190 din 18 iulie 2018 (Monitorul Oficial issue number not shown on the ANSPDCP pages fetched this session -- see catalog docstring); in force since 31 July 2018 per ANSPDCP"
     :statute/url "https://www.dataprotection.ro/servlet/ViewDocument?id=1520"
     :statute/url-provenance :official-anspdcp
     :statute/enacted-date "2018-07-18"
     :statute/retrieved-at "2026-07-23"
     :statute/topic #{:data-protection :privacy}}
    {:statute/id "rou.legea-53-2003-codul-muncii"
     :statute/title "Legea nr. 53/2003 - Codul muncii (Labour Code)"
     :statute/jurisdiction "ROU"
     :statute/kind :law
     :statute/law-number "adoptată 24 ianuarie 2003; formă republicată publicată în Monitorul Oficial al României, Partea I, nr. 345 din 18 mai 2011, per ro.wikipedia.org (secondary source, official ministry/inspectorate pages did not surface this citation this session -- see catalog docstring)"
     :statute/url "https://ro.wikipedia.org/wiki/Codul_muncii_al_Rom%C3%A2niei"
     :statute/url-provenance :wikipedia-ro-secondary
     :statute/enacted-date "2003-01-24"
     :statute/retrieved-at "2026-07-23"
     :statute/topic #{:labor :employment}}]})

(defn spec-basis
  "The jurisdiction's statute vector, or nil -- nil means NO spec-basis
  for that jurisdiction yet."
  [iso3]
  (get catalog iso3))

(defn coverage
  "Honest coverage report, same shape/discipline as `marketentry.facts/coverage`:
  never report a missing jurisdiction as covered."
  ([] (coverage (keys catalog)))
  ([iso3s]
   (let [have (filter catalog iso3s)
         missing (remove catalog iso3s)]
     {:requested (count iso3s)
      :covered (count have)
      :covered-jurisdictions (vec (sort have))
      :missing-jurisdictions (vec (sort missing))
      :note (str "cloud-itonami-iso3166-rou statute.facts Wave 0 (ADR-2607141700): "
                 (count (get catalog "ROU")) " ROU statutes seeded, one per official "
                 "onrc.ro/dataprotection.ro source and one via ro.wikipedia.org "
                 "(disclosed secondary tier) -- see catalog docstring for the full "
                 "provenance trail, including why a fourth (public-procurement) "
                 "candidate entry was deliberately dropped rather than seeded "
                 "unverified. Extend `statute.facts/catalog`, never fabricate an "
                 "id/url/date.")})))

(defn by-topic
  "Statutes for `iso3` tagged with `topic` (e.g. :labor, :data-protection)."
  [iso3 topic]
  (filterv #(contains? (:statute/topic %) topic) (spec-basis iso3)))
