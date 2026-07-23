# cloud-itonami-iso3166-rou

**`:implemented`** for **ROU**. Flagship `eu-establishment-missing`, tax `cui-unverified`.

```
clojure -M:dev:test
```

## Statute catalog

Alongside the market-entry catalog, this repo carries a **general-law
compliance catalog** (ADR-2607141700, cloud-itonami-compliance-fact-
federation) of statutes a company operating in Romania must generally
track for compliance:

- `src/statute/facts.cljc` — the catalog, source of truth: Legea
  societăților nr. 31/1990 (companies law, extends `marketentry.facts`'s
  existing `onrc.ro` corporate-number citation), Legea nr. 190/2018
  (GDPR implementing-measures law, fetched directly from ANSPDCP),
  Legea nr. 53/2003 — Codul muncii (labour code).
- `schema/statute.edn` — DataScript schema.
- `data/datascript-tx.edn` — derived DataScript tx-data (regenerated
  from the catalog, never hand-edited).

Same provenance discipline as the market-entry catalog: every entry
cites a source actually fetched this session, with honest disclosure of
weaker-tier or unreachable sources (see the `statute.facts` namespace
docstring) rather than an invented citation. An entry not in
`statute.facts/catalog` has no spec-basis — never fabricate one.

## Culture catalog

Alongside the market-entry / statute catalogs, this repo carries a
**country-level regional-culture catalog** (ADR-2607171400 addendum 2,
`cloud-itonami-municipality-culture-catalog` Wave 1, in
`com-junkawasaki/root`) — national dishes, protected products, beverages,
crafts, festivals and heritage sites for Romania:

- `src/culture/facts.cljc` — the catalog, source of truth (keyed by
  uppercase ISO3, mirroring `statute.facts`).
- `schema/culture.edn` — DataScript schema.
- `data/culture-tx.edn` — derived DataScript tx-data (regenerated from
  the catalog, never hand-edited).

City-level counterparts live in the `cloud-itonami-municipality-*` repos.
Same provenance discipline as the compliance catalogs: every entry cites a
source URL that was actually fetched and read on `:culture/retrieved-at`;
summaries state only what the cited source confirms. An item not in
`culture.facts/catalog` has no spec-basis — never fabricate one.

AGPL-3.0-or-later.
