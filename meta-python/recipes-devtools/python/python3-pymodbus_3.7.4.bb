SUMMARY = "A fully featured modbus protocol stack in python"
HOMEPAGE = "https://github.com/riptideio/pymodbus/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=eba8057aa82c058d2042b4b0a0e9cc63"

SRC_URI[sha256sum] = "573c370aea04523403eea1e159616a583cd7b93cfc5c81b07340d3cccd52c99f"

inherit pypi python_setuptools_build_meta

PACKAGECONFIG ??= ""
PACKAGECONFIG[repl] = ",,,python3-aiohttp python3-click python3-prompt-toolkit python3-pygments python3-pyserial-asyncio"
PACKAGECONFIG[asyncio] = ",,,python3-pyserial-asyncio"
PACKAGECONFIG[tornado] = ",,,python3-tornado"
PACKAGECONFIG[twisted] = ",,,python3-twisted-conch"
PACKAGECONFIG[redis] = ",,,python3-redis"
PACKAGECONFIG[sql] = ",,,python3-sqlalchemy"

RDEPENDS:${PN} += " \
    python3-asyncio \
    python3-core \
    python3-io \
    python3-json \
    python3-logging \
    python3-math \
    python3-netserver \
"

RDEPENDS:${PN} += " \
    python3-pyserial \
    python3-six \
"
