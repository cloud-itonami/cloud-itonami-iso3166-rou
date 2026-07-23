# ADR-0001: ROU

`eu-establishment-missing` / `cui-unverified`.

## Addendum: statute catalog (ADR-2607141700)

Closed the structural country-axis gap: this repo had `culture` and
`marketentry` but no `statute` catalog, unlike fully-scaffolded
iso3166 siblings (e.g. `-pol`, `-bgr`, `-hrv`). Added
`src/statute/facts.cljc` — three general-law entries (companies,
GDPR-implementing, labour), each independently sourced this session
(`onrc.ro`, `dataprotection.ro`/ANSPDCP, `ro.wikipedia.org`). The
companies-law entry (Legea 31/1990) deliberately reuses the same
`onrc.ro` authority `marketentry.facts` already cites for
corporate-number verification, rather than introducing a
second, uncoordinated citation for the same authority. A fourth
candidate entry (Legea 98/2016, public procurement) was deliberately
dropped rather than seeded unverified: `legislatie.just.ro`,
`anap.gov.ro`, `e-licitatie.ro` and `cdep.ro` all failed this session
with connection-level errors (not bot-detection challenges — no
challenge was ever served, so no bypass was attempted or appropriate),
and no reachable page named the law with a citable number/date. See
`src/statute/facts.cljc` docstring for the full provenance trail.
